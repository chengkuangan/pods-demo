# Sample Data Generator

Change the following at [Generator.java](/SampleGen/src/main/java/blog/braindose/demo/Generator.java) and then run to generate sample data:

```Java
// Number of record to generate
List<Booking> newBookings = gen.create(900);
```

```Java
// Filename for the generated sample data
FileOutputStream out = new FileOutputStream(new File("/Users/ganck/Downloads/sample-900.json"));
```
