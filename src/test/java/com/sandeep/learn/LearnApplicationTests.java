package com.sandeep.learn;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
class LearnApplicationTests {

	@Test
	void contextLoads(){
		log.info("Test case executing..");
		log.info("Test case executing..second statement.");
		assertEquals(true, true);
	}

}
