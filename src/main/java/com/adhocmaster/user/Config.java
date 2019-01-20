package com.adhocmaster.user;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories( "com.adhocmaster.user" )
@ComponentScan(  "com.adhocmaster.user" )
@EntityScan( "com.adhocmaster.user" )
public class Config {

}
