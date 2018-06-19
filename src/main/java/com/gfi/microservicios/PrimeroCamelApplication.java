package com.gfi.microservicios;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.SimpleRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimeroCamelApplication {

	

	
	public static void main(String[] args) {
		SpringApplication.run(PrimeroCamelApplication.class, args);
	    
		
	}
}
