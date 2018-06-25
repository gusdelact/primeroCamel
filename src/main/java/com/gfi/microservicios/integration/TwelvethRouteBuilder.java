package com.gfi.microservicios.integration;


import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;



//EIP: Message Filter
@Component
public class TwelvethRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		
		super
		.from("file:data/tmp/in/route12")
		.filter()
		.xpath("//name='ratatouille'")
		.to("jms:queue:route12")
		;
		
		super
		.from("jms:queue:route12")
		.to("log:route12")
		;
		
		
		
	}

}
