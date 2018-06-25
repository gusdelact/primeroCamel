package com.gfi.microservicios.integration.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Step2Bean {
	 private final static Logger LOGGER = 
			 LoggerFactory.getLogger(Step2Bean.class);
	 
	 public static void single(String body) {
		 LOGGER.info("STEP 2:" + body);
	 }
}
