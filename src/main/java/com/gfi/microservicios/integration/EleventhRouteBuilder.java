package com.gfi.microservicios.integration;


import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;



//EIP: Content Based Router
@Component
public class EleventhRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		
		super
		.from("file:data/tmp/in/route11")
		.choice()
		  .when()
		  .xpath("//address='France'")
		  .to("file:data/tmp/out/route11/france")
		  .to("log:route11France")
		  .when()
		  .xpath("//address='USA'")
		  .to("file:data/tmp/out/route11/usa")
		  .to("log:route11USA")
		  .otherwise()
		  .to("file:data/tmp/out/route11/otro")
		  .to("log:route11Otro")
		;
		
		
	}

}
