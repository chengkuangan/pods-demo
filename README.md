# Camel Demo for PODS

## Deploying the Demo to OpenShift

1. You will need the following operator installed before deploying the demo:
    - AMQ Broker Operator. Refer product documentation to install AMQ Broker Operator.
    - Grafana Operator. Refer Grafana Operator documentation to install the operator.
<br>

2. Refer [Deploying Grafana on OpenShift 4](https://cloud.redhat.com/experts/o11y/ocp-grafana/)

    - Correction on the step to get Token
        ```
        # The serviceaccount may not link to the token required. In this case, you need to manually find out what is the actual token created as OCP secret.
        BEARER_TOKEN=$(oc serviceaccounts get-token grafana-serviceaccount)
        ```
    - After Grafana is installed, change the default user role from `Viewer` to `Admin`. Perform this from the Grafana Operator Console. This allow you to change the Grafana settings and add new dashboards.
        ```
        users:
          auto_assign_org: true
          auto_assign_org_role: Admin
        ```
<br>

3. Run the `deployDemo.sh` command to install the demo.

    ```
    ./deployDemo.sh -i
    ```

    This will create a project named `sia-apps` with AMOBroker, PostgreSQl, Ingestor, Transformer
    <br>
    
    **Changing Deployment Configurations**
    
    <br>You can change the AMQ Broker, PostgreSQL settings in the script before running it:
    
    PostgresSQL settings:

    ```
    BOOKING_DB_NAME="booking"
    BOOKING_APPS_NAME="${BOOKING_DB_NAME}-postgres"
    BOOKING_DB_HOST="${BOOKING_APPS_NAME}.${APPS_NAMESPACE}.svc.cluster.local"
    BOOKING_DB_USERNAME="booking"
    BOOKING_DB_PASSWORD="flight"
    BOOKING_DB_PORT="5432"
    BOOKING_DB_SCHEMA="pnr"
    ```

    AMQ Broker Settings:
    ```
    AMQ_NAME="booking-amq"
    AMQ_CORE_NAME="core"
    # Sample url: amq-broker-core-0-svc.sia-apps.svc.cluster.local
    AMQ_HOST="${AMQ_NAME}-${AMQ_CORE_NAME}-0-svc.${APPS_NAMESPACE}.svc.cluster.local"
    # AMQ core port
    AMQ_PORT="61616"
    AMQ_URL="tcp://${AMQ_HOST}:${AMQ_PORT}"
    AMQ_USERNAME="admin"
    AMQ_PASSWORD="admin"
    ```

    If you are using external PostgreSQL, comment out the following function. This will skipp the PostgreSQL database deployment.
    ```
    deloyDatabases
    ```
    In this case, you need to initialize the database yourself using the [initdb.sh](/sql/initdb.sh). You have to deploy and initialize the database first before running the `deployDemo.sh` script.
  <br>
4. Enable the Prometheus monitoring for workloads.
    
    ```
    # Change to the correct relative path
    TEMPLATES_DIR=./yaml
    # Defaulted to sia-apps
    APPS_NAMESPACE=sia-apps
    # Create a Prometheus configmap to enable workload monitoring
    oc create -f ${TEMPLATES_DIR}/monitoring/ocp/cluster-monitoring-config.yaml
    # Create ServiceMonitor for Ingestor and Transformer apps
    oc create -f ${TEMPLATES_DIR}/monitoring/ocp/service-monitor.yaml -n ${APPS_NAMESPACE}
    ```

5. Deploy the Dashboard at [/yaml/monitoring/grafana/dashboards/batch.json](/yaml/monitoring/grafana/dashboards/batch.json).

    If the dashboard showing warning or error, try to edit each visual component to manually select the data source.

6. Demonstrate it

    Copy the sample JSON file to the `/input` directory in the Ingestor pod
    ```
    oc cp ./samples/sample-100.json <pod>:/input/
    ```

## Test Results

- 1st Run. Usually a bit faster because no existing record to delete.

  | Total Messages  | Total Message Size (MB)  | Ingestor Throughput (mps) | Total DB Inserts | Insert SQL Throughput   | Total DB Time | DB Time per 1000 messages|
  |-----------------|-----------------|-----------------|-----------------|-----------------|-----------------|-----------------|
  | 1000 | 66.5 | 66.2 |100,000|4,372|22.1s|22.1s|

  Statistic output from Postgresql log.

  ```
  2023-12-18 07:33:38.064 GMT [51] LOG:  checkpoint complete: wrote 428 buffers (2.6%); 0 WAL file(s) added, 0 removed, 0 recycled; write=42.569 s, sync=0.009 s, total=42.584 s; sync files=43, longest=0.003 s, average=0.001 s; distance=5178 kB, estimate=5178 kB
  ```
- 2nd Run
  | Total Messages  | Total Message Size (MB)  | Ingestor Throughput (mps) | Total DB Inserts | Insert SQL Throughput   | Total DB Time | DB Time per 1000 messages|
  |-----------------|-----------------|-----------------|-----------------|-----------------|-----------------|-----------------|
  | 2000 | 133 | 78.1 |200,000|4,372|45.7s|22.9s|

- 3nd Run
  | Total Messages  | Total Message Size (MB)  | Ingestor Throughput (mps) | Total DB Inserts | Insert SQL Throughput   | Total DB Time | DB Time per 1000 messages|
  |-----------------|-----------------|-----------------|-----------------|-----------------|-----------------|-----------------|
  | 3000 | 200 | 87.4 |300,000|4,291|1.17min|23.3s|

- 4nd Run
  | Total Messages  | Total Message Size (MB)  | Ingestor Throughput (mps) | Total DB Inserts | Insert SQL Throughput   | Total DB Time | DB Time per 1000 messages|
  |-----------------|-----------------|-----------------|-----------------|-----------------|-----------------|-----------------|
  | 3000 | 200 | 87.4 |300,000|4,291|1.17min|23.3s|

  Postgresql Log:
  
  ```
  2023-12-18 07:42:55.157 GMT [51] LOG:  checkpoint starting: time
  2023-12-18 07:46:41.099 GMT [51] LOG:  checkpoint complete: wrote 2259 buffers (13.8%); 0 WAL file(s) added, 0 removed, 3 recycled; write=225.929 s, sync=0.003 s, total=225.942 s; sync files=40, longest=0.003 s, average=0.001 s; distance=38032 kB, estimate=38032 kB
  ```
- 5nd Run
  | Total Messages  | Total Message Size (MB)  | Ingestor Throughput (mps) | Total DB Inserts | Insert SQL Throughput   | Total DB Time | DB Time per 1000 messages|
  |-----------------|-----------------|-----------------|-----------------|-----------------|-----------------|-----------------|
  | 4000 | 266 | 92.9 |400,000|4,316|1.54min|23.2s|

  Postgresql Log:
  
  ```
  2023-12-18 07:47:55.173 GMT [51] LOG:  checkpoint starting: time
  2023-12-18 07:51:12.181 GMT [51] LOG:  checkpoint complete: wrote 1983 buffers (12.1%); 0 WAL file(s) added, 0 removed, 3 recycled; write=196.993 s, sync=0.004 s, total=197.008 s; sync files=40, longest=0.002 s, average=0.001 s; distance=49688 kB, estimate=49688 kB
  ```

## Running the Demo locally

1. Run the following at the root directory:

    ```
    docker compose -f docker-compose.yaml up --build
    ```

2. Demonstrate it

    Copy the sample JSON file to the `/tmp/sia/` directory in the Ingestor pod
    ```
    oc cp ./samples/sample-100.json /tmp/sia/
    ```
    
## References

**Postgresql Metrics**
- Refer [How to monitor Postgresql with Prometheus and Grafana](https://nelsoncode.medium.com/how-to-monitor-posgresql-with-prometheus-and-grafana-docker-36d216532ea2)
- Use the [community dashboard for PostgreSQL](https://grafana.com/grafana/dashboards/9628-postgresql-database/)

**Postgresql Configuration**
- Runtime parameters for [Docker and Kubernetes](https://stackoverflow.com/questions/47252026/how-to-increase-max-connection-in-the-official-postgresql-docker-image)
- PostgreSQL [runtime configuration](https://www.postgresql.org/docs/8.0/runtime-config.html)

**Tuning PostSQL**
- [How to tune PostgreSQL for memory](https://www.enterprisedb.com/postgres-tutorials/how-tune-postgresql-memory)
- [PostgreSQL shared_buffer](https://www.educba.com/postgresql-shared_buffer/)