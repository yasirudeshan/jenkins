package com.example.spring_jenkins;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class SpringJenkinsApplication {

	public static final Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);

	public void intt(){
		logger.info("Application Started");
	}

	public static void main(String[] args) {
		logger.info("Application Executed");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

	//this is the new change
	//here's another change in order to check the auto building process.
}
