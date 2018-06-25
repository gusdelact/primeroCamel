package com.gfi.microservicios.integration;

import org.apache.camel.Exchange;
import org.apache.camel.Predicate;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;
//EIP: Message Router y tambien DataType Channel
@Component
public class FourthRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		super
		.from("file:data/tmp/in")
		.choice()
		.when( )
		   .simple("${file:ext} == 'json' ")
		   .to("file:data/tmp/out/json")
		   .log("archivo JSON")
		 .when()
		   .simple("${file:ext} == 'txt' ")
		   .to("file:data/tmp/out/txt")
		   .log("archivo TXT")
		 .otherwise()
		   .to("file:data/tmp/out/bin")
		   .log("archivo generico")
		  .pollEnrich("file:data/input?delete=true&readLock=none")
		;
		
	}

}
