package com.gfi.microservicios.controller;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;





@RestController
@RequestMapping(value = "/integracion")
public class EIPRouteController {

	 private final static Logger LOGGER = 
			 LoggerFactory.getLogger(EIPRouteController.class);
	@Autowired
	CamelContext camelContext;
	

	@RequestMapping(value="/v1/ruta2",method = RequestMethod.GET)
	public void ruta2() {
		
			ProducerTemplate producerTemplate= 
					camelContext.createProducerTemplate();
			
			producerTemplate.sendBody("direct:start","Packt");

		return ;
	}
	
	@RequestMapping(value="/v1/ruta3",method = RequestMethod.GET)
	public void ruta3() {
		
			ProducerTemplate producerTemplate= 
					camelContext.createProducerTemplate();
			
			producerTemplate.sendBody("direct:ruta3","hola ruta 3");

		return ;
	}
}
