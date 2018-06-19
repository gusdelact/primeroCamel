package com.gfi.microservicios.integration;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ThirdRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		super
		.from("direct:ruta3")
		.bean(Step1Bean.class)
		.bean(Step2Bean.class)
		.to("log:pipeline");
	}

}
