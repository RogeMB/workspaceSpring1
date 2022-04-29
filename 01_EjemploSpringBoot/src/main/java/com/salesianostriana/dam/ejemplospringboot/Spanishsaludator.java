package com.salesianostriana.dam.ejemplospringboot;

import org.springframework.stereotype.Component;

@Component
public class Spanishsaludator implements Saludator {

	private String saludo;
	
	@Override
	public void setSaludo(String s) {
		// TODO Auto-generated method stub
		saludo = s;
	}
	

	@Override
	public void printSaludo() {
		// TODO Auto-generated method stub
		System.out.println("HolaMundo");
	}

}
