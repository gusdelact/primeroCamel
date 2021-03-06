package com.gfi.microservicios.integration;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

//EIP: Point to Point Channel
@Component
public class SeventhRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		
		super
		.from("file:data/tmp/in/route7")
		.to("jms:queue:route7")
		;
		
		super
		.from("timer:fire?period=30000")
		 .setBody()
		 .constant("un mensaje para ruta 7")
		.to("jms:queue:route7")
		;
		
		super
		.from("jms:queue:route7")
		.to("log:route7_1");
		
		super
		.from("jms:queue:route7")
		.to("log:route7_2");
		
		
	}

}
