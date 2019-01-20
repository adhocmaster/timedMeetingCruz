package com.adhocmaster.user;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.timedMeeting.TimedMeetingApplication;
import com.timedMeeting.UserRepository;
@SpringBootTest( classes = TimedMeetingApplication.class )
@RunWith(SpringRunner.class)
public class UserServiceTest {

    @Autowired
    private UserRepository userRepository;
	@Test
	public void save() {
		
		User user = new User();
		user.setPassword( "abcd" );
		user.setPasswordConfirm( "abcd" );
		
		
	}
}
