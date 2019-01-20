package com.adhocmaster.user;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.timedMeeting.TimedMeetingApplication;
@SpringBootTest( classes = TimedMeetingApplication.class )
@RunWith(SpringRunner.class)
public class RoleRepositoryTest {

	
	@Autowired
	RoleRepository roleRepository;
	
	@Test
	public void save() {


		Role r = new Role();
		r.setName( "USER" );
		roleRepository.save( r );
		
	}

}
