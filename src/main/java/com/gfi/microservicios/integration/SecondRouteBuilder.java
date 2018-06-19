package com.gfi.microservicios.integration;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class SecondRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		super
		.from("direct:start")
		.bean(SimpleBeanIntegration.class,"hello")
		.to("mock:stop");
	}

}
