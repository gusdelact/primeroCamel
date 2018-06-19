package com.gfi.microservicios.integration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Step1Bean {
	 private final static Logger LOGGER = 
			 LoggerFactory.getLogger(Step1Bean.class);
	 
	 public static void single(String body) {
		 LOGGER.info("STEP 1:" + body);
	 }
}
