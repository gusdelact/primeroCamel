package com.gfi.microservicios.integration.beans;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class TenthProcessor implements Processor{
	
	 private final static Logger LOGGER = LoggerFactory.getLogger(TenthProcessor.class);

	@Override
	public void process(Exchange exchange) throws Exception {
		String inBody = exchange.getIn().getBody(String.class);
		Message outBody= exchange.getOut();
		outBody.setBody(inBody.toUpperCase());
		LOGGER.info("Inbody ..." + inBody);
		LOGGER.info("OutBody ..." + outBody);
		
	}

}
