package com.gfi.microservicios.integration;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class SimpleRoute extends RouteBuilder {

	@Autowired
	Environment environment;
	
	@Override
	public void configure() throws Exception {
		super.from("timer:hello?period=10s")
		      .log("Timer invocado y el body es ${body} " + environment.getProperty("mensaje"))
		      .pollEnrich("file:data/input?delete=true&readLock=none")
		      .to("file:data/output");
	}

}
