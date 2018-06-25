package com.gfi.microservicios.integration;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

//EIP: Publish Subscribe Channel
@Component
public class EightRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		
		super
		.from("file:data/tmp/in/route8")
		.to("jms:topic:route8")
		;
		
		super
		.from("timer:fire?period=30000")
		 .setBody()
		 .constant("un mensaje para ruta 8")
		.to("jms:topic:route8")
		;
		
		super
		.from("jms:topic:route8")
		.to("log:route8_1");
		
		super
		.from("jms:topic:route8")
		.to("log:route8_2");
		
		
	}

}
