package com.gfi.microservicios.integration.beans;

import org.springframework.stereotype.Component;

@Component("tenthbean")
public class TenthBean {
	
	public String metodo() {
		return "bean10";
	}

}
