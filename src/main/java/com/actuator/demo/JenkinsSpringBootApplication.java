package com.actuator.demo;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class JenkinsSpringBootApplication extends SpringBootServletInitializer{
	
	public static Logger logger = LoggerFactory.getLogger(JenkinsSpringBootApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("Application started ........");
	}
	

	public static void main(String[] args) {
		logger.info("Application executed ........");
		SpringApplication.run(JenkinsSpringBootApplication.class, args);
	}
	
	@Override
	  protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	    return builder.sources(JenkinsSpringBootApplication.class);
	  }

}
