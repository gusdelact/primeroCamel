package com.gfi.microservicios.integration;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

//EIP: Guaranteed Delivery
@Component
public class Nineth_2RouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
	
		super
		.from("file:data/tmp/out/route9")
		 .convertBodyTo(java.lang.String.class)
		.to("log:route9");
		
		
	}

}
