package com.spring.lifecycle.service;

import lombok.Data;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
@Data
public class TestService {
    private static final Logger logger = LogManager.getLogger(TestService.class);


    public void testMethod() {
        logger.debug("testMethod was called");
    }
}
