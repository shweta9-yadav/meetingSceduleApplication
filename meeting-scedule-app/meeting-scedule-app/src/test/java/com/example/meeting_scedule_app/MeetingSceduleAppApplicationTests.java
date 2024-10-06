package com.example.meeting_scedule_app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MeetingSceduleAppApplicationTests {
	
    private Scheduler scheduler;


	@Test
	void contextLoads() {
	}
	
	@BeforeEach
    void setUp() {
        scheduler = new Scheduler();
    }
	
	@Test
    void testScheduleNonOverlappingMeetings() {
        Meeting meeting1 = new Meeting("Meeting 3",900, 1000); 
        Meeting meeting2 = new Meeting("Meeting 4",1030, 1130);

        boolean result1 = scheduler.scheduleMeeting(meeting1);
        boolean result2 = scheduler.scheduleMeeting(meeting2);


        assertFalse(result1);
        assertTrue(result2); 
        assertEquals(2, scheduler.getScheduledMeetings().size());
    }
	

}
