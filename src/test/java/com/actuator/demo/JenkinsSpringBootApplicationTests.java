package com.actuator.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsSpringBootApplicationTests {
	
	public static Logger logger = LoggerFactory.getLogger(JenkinsSpringBootApplication.class);

// hello world
	@Test
	void contextLoads() {
		logger.info("Application executed ........");
		assertEquals(true, true);
	}

}
