package com.timedMeeting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@Import( { com.adhocmaster.user.Config.class } )

@EnableJpaRepositories
@ComponentScan( basePackages = {"com.adhocmaster.", "com.timedMeeting.*" } )

@EntityScan( "com.timedMeeting.*" )
public class TimedMeetingApplication {

	public static void main(String[] args) {
		SpringApplication.run(TimedMeetingApplication.class, args);
	}

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
}

