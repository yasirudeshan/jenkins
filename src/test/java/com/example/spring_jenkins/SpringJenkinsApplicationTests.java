package com.example.spring_jenkins;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.jupiter.api.Assertions.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringJenkinsApplicationTests {

	public static final Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);


	@Test
	void contextLoads() {
		logger.info("Test case Executed");
        assertTrue(true);
	}

}
