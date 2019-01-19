package com.timedMeeting.meeting;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.apache.logging.log4j.util.Strings;

import com.timedMeeting.meeting.schemes.MeetingSchemeType;

import lombok.Data;

@Entity
@Data
public class Meeting {
	
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO )
	long id;

	String name = Strings.EMPTY;
	
	Date dateStart = null;
	Date dateEnd = null;
	Date dataCreated = null;
	
	@Enumerated( EnumType.STRING )
	MeetingSchemeType type = MeetingSchemeType.MEMBER_BASED;
	
	

}
