package com.gfi.microservicios.integration.beans;

import java.util.Random;

public class ThirteenDynamicRouterBean {

	 public String rutear(String body) {
		 Random aleatorio = new Random();
		 int valor = aleatorio.nextInt(1000);
		 if (valor >=500) {
			 return "jms:queue:ruta13A";
		 } else {
			 return "jms:queue:ruta13B";
		 }
	 }
}
