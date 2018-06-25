package com.gfi.microservicios.integration;

import org.apache.camel.ExchangePattern;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import com.gfi.microservicios.integration.beans.TenthProcessor;


//EIP: Event Message
@Component
public class TenthRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		
		super
		.from("direct:ruta10")
		.setExchangePattern(ExchangePattern.InOnly)
		.to("bean:tenthbean")
		.process(new TenthProcessor())
		.to("log:route10")
		;
		
		
		
	}

}
