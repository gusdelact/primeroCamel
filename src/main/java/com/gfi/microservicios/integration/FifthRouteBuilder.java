package com.gfi.microservicios.integration;

import org.apache.camel.Exchange;
import org.apache.camel.Predicate;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class FifthRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		super
		.from("file:data/tmp/in/route5")
		.pollEnrich("file:data/tmp/in/route5?delete=true&readLock=none")
		.transform()
		  .simple("Hello ${in.body}")
		 .to("file:data/tmp/out")
		;
		
	}

}
