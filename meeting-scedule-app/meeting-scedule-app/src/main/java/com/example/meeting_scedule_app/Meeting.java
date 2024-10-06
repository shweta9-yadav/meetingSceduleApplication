package com.example.meeting_scedule_app;

import java.time.LocalTime;

public class Meeting {
	 private String name;
	private int startTime;
    private int endTime;
    
    public Meeting(String name,int startTime, int endTime) {
    	this.name = name;
    	 this.startTime = startTime;
         this.endTime = endTime;
         if (this.startTime < 0 || this.startTime >= 2400 || (this.startTime % 100) >= 60) {
             throw new IllegalArgumentException("Invalid time: " + this.startTime + "eg. Please enter time in 24-hour format (0000 to 2359).");
         }
         if(this.endTime < 0 || this.endTime >= 2400 || (this.endTime % 100) >= 60) {
             throw new IllegalArgumentException("Invalid time: " + this.endTime + "eg. Please enter time in 24-hour format (0000 to 2359).");

         }
         if (convertToTime(this.startTime).isAfter(convertToTime(this.endTime))) {
             throw new IllegalArgumentException("Start time must be before end time");
         }
       
    }
    private LocalTime convertToTime(int time) {
        int hours = time / 100;
        int minutes = time % 100;
        return LocalTime.of(hours, minutes);
    }
    
    public int getStartTime() {
        return startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        return name +" : " + startTime + " to " + endTime;
    }

}
