package com.gfi.microservicios.integration;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

//EIP: Guaranteed Delivery
@Component
public class Nineth_1RouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		
		super
		.from("timer:fire?period=30000")
		 .setBody()
		 .constant("un mensaje para ruta 9")
		.to("file:data/tmp/out/route9")
		;
		
	}

}
