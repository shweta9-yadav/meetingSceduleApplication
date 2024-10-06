package com.example.meeting_scedule_app;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MeetingSceduleAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeetingSceduleAppApplication.class, args);
		 Scheduler scheduler = new Scheduler();

		 
		 Meeting meeting1 = new Meeting("Meeting 1",1300, 1400); 
		 Meeting meeting2 = new Meeting("Meeting 2",1330, 1430);   
	        scheduler.scheduleMeeting(meeting1);
	        scheduler.scheduleMeeting(meeting2);
	       
	        ArrayList<Meeting> data =scheduler.getScheduledMeetings();
	        System.out.println(data);
	}

}
