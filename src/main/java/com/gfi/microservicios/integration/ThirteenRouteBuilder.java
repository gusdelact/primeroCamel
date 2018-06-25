package com.gfi.microservicios.integration;


import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import com.gfi.microservicios.integration.beans.ThirteenDynamicRouterBean;




//EIP: Message Filter
@Component
public class ThirteenRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		
		super
		.from("file:data/tmp/in/route13")
		.pollEnrich("file:data/tmp/in/route13?delete=true&readLock=none")
		.dynamicRouter()
		  .method(new ThirteenDynamicRouterBean(), "rutear")
		;
		
		super
		.from("jms:queue:ruta13A")
		.to("log:ruta13A")
		;

		super
		.from("jms:queue:ruta13B")
		.to("log:ruta13B")
		;
		
		
		
	}

}
