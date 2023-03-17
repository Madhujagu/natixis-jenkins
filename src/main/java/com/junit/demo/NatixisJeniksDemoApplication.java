package com.junit.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class NatixisJeniksDemoApplication {

	public static Logger logger = LoggerFactory.getLogger(NatixisJeniksDemoApplication.class);
	

	public static void main(String[] args) {
		
		logger.info("Started with LoggerFactor.......");
		SpringApplication.run(NatixisJeniksDemoApplication.class, args);
	}

}
