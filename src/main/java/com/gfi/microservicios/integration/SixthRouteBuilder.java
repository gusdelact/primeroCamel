package com.gfi.microservicios.integration;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class SixthRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		super
		.from("file:data/tmp/in/route6")
		.process(new SixthPrependProcessor())
		.pollEnrich("file:data/tmp/in/route6?delete=true&readLock=none")
		.to("file:data/tmp/out")
		;
		
	}

}
