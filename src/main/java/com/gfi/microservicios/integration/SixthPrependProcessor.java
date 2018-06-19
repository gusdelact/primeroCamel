package com.gfi.microservicios.integration;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class SixthPrependProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		String inBody=exchange.getIn().getBody(String.class);
        inBody= "Goodbye " + inBody;
        exchange.getIn().setBody(inBody.toString().toUpperCase());
	}

}
