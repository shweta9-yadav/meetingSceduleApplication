package com.example.meeting_scedule_app;

import java.util.ArrayList;
import java.util.List;

public class Scheduler {
	private List<Meeting> meetings;
	  public Scheduler() {
	        meetings = new ArrayList<>();
	    }
	  
	  public boolean scheduleMeeting(Meeting Meetings) {
	        for (Meeting existingMeeting : meetings) {
	            if (doMeetingsOverlap(existingMeeting, Meetings)) {
	                System.out.println(Meetings +" (overlap with "+existingMeeting.getName()+" )");
	                return false;
	            }
	        }
	        meetings.add(Meetings);
	        System.out.println(Meetings);
	        return true;
	    }
	  
	  private boolean doMeetingsOverlap(Meeting m1, Meeting m2) {
		    return !(m1.getEndTime() <= m2.getStartTime() || m1.getStartTime() >= m2.getEndTime());
		}
	  
	  public ArrayList<Meeting> getScheduledMeetings(){
		  ArrayList<Meeting> meetingsdata = new ArrayList<Meeting>();
		  if(!meetings.isEmpty()) {
			 for(Meeting meeting : meetings) {
				 meetingsdata.add(meeting);
			 }
		  }	 
		 return meetingsdata;
		  
	  }

}
