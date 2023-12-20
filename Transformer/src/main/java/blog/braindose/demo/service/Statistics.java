package blog.braindose.demo.service;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.text.NumberFormatter;

import org.apache.camel.Exchange;

public class Statistics {

    private long startTime, totalDuration, totalSize, totalFile, totalRecord;
    private DecimalFormat df1 = new DecimalFormat("###,###,###");
    private DecimalFormat df2 = new DecimalFormat("###,###,###.#");

    public String echo(){
        
        double seconds = ((double) totalDuration) / 1000;
        double minutes = seconds / 60;
        double hours = minutes / 60;
        double timeValue = totalDuration;
        String timeLabel = "millisec";
        String sizeLabel = "bytes";

        double kb = totalSize / 1024;
        double mb = kb / 1024;
        double gb = mb / 1024;
        double sizeValue = totalSize;

        //System.out.printf("totalDuration: %s, seconds: %s, minutes: %s, hours: %s%n", totalDuration, seconds, minutes, hours);

        if (hours >= 1){
            timeLabel = "hr";
            timeValue = hours;
        }
        else if (minutes >= 1){
            timeLabel = "min";
            timeValue = minutes;
        }
        else if (seconds >= 1){
            timeLabel = "sec";
            timeValue = seconds;
        }

        if (gb > 1){
            sizeLabel = "Gb";
            sizeValue = gb;
        }
        else if (mb > 1){
            sizeLabel = "Mb";
            sizeValue = mb;
        }
        else if (kb > 1){
            sizeLabel = "Kb";
            sizeValue = kb;
        }

        return "Throughput: " + df1.format(totalRecord/seconds) + ", Total Duration: " + df2.format(timeValue) + " " + timeLabel + ", Total Size: " + df2.format(sizeValue) + " " + sizeLabel + ", Total Record: " + totalRecord + ", Total SQL Inserts: " + (totalRecord * 5);
    }

    public void addDuration(long endTime){
        long duration = endTime - startTime;
        this.totalDuration += duration;
    }

    public void incrementRecordCount(){
        this.totalRecord++;
    }

    public void incrementFileCounter(){
        this.totalFile++;
    }

    public void addSize(long size){
        this.totalSize += size;
    }

    public long getTotalFile(){
        return totalFile;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getTotalDuration() {
        return totalDuration;
    }

    public long getTotalSize() {
        return totalSize;
    }

    public void begin(Exchange exchange) {
        String file = exchange.getIn().getBody(String.class);
        byte[] content = file.getBytes();
    
        long size = (long) content.length;
        long startTime = System.currentTimeMillis();
        long totalDuration = exchange.getProperty("TOTAL_DURATION") != null ? (long) exchange.getProperty("TOTAL_DURATION"): 0l;
        long totalSize = exchange.getProperty("TOTAL_SIZE") != null ? (long) exchange.getProperty("TOTAL_SIZE") : 0l;

        exchange.setProperty("CONTENT_SIZE", size);
        exchange.setProperty("TOTAL_SIZE", 0l);
        exchange.setProperty("TOTAL_DURATION", 0l);
        exchange.setProperty("START_TIME", startTime);

        System.out.printf("StartTime: %d, File size: %d, Total Duration: %d, Total Size: %d%n", startTime, size, totalDuration, totalSize);
    }

    public void end(Exchange exchange) {
        
        long totalDuration = (long) exchange.getProperty("TOTAL_DURATION");
        long totalSize = (long) exchange.getProperty("TOTAL_SIZE");
        long size = (long) exchange.getProperty("CONTENT_SIZE");

        long startTime = (long) exchange.getProperty("START_TIME");
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        totalDuration += duration;
        totalSize += size;
        
        exchange.setProperty("TOTAL_DURATION", totalDuration);
        exchange.setProperty("TOTAL_SIZE", totalSize);

        System.out.printf("Total Duration: %d milliseconds, Total Size: %d bytes %n", totalDuration, totalSize);
    }
    
}
