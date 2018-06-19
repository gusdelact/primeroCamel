package com.gfi.microservicios.integration;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class SeventhRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		
		super
		.from("file:data/tmp/in/route7")
		.to("jms:route7")
		;
		
		super
		.from("jms:route7")
		.to("log:route7");
		
		
	}

}
