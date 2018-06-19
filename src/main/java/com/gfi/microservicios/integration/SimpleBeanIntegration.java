package com.gfi.microservicios.integration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class SimpleBeanIntegration {

	 private final static Logger LOGGER = 
			 LoggerFactory.getLogger(SimpleBeanIntegration.class);
	 
	  public static String hello(String message) {
	        LOGGER.info("Hello " + message);
	        return "Hello" + message;
	    }
}
