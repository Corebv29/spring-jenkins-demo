package com.corebv.jenkins.api;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringJenkinsDemoApplicationTests {

    public static Logger logger = LoggerFactory.getLogger(SpringJenkinsDemoApplicationTests.class);
    
    @Test
    void contextLoads() {
        logger.info("Test case executing");
        assertEquals(true,true);
    }

}
