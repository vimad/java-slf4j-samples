package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ExternalService {
    public static final Logger LOGGER = LogManager.getLogger(ExternalService.class);

    public void log() {
        LOGGER.info("Hello from library");
    }
}