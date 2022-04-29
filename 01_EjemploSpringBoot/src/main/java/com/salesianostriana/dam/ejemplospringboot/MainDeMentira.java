package com.salesianostriana.dam.ejemplospringboot;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// La clase de Main de Mentira no la utilizaremos normalmente

@Component    
public class MainDeMentira { // main de mentira depende de Saludator (clase) porque tiene un atributo Saludator saludator; Esto es una dependencia
	
	@Autowired // Es la manera de coger (pescar, buscar) en el contenedor. Contecta Main de mentira con Saludator. 
	private Saludator saludator;
	
	@PostConstruct // esta anotación hace que este método se ejecute solo al contruir el bean
	public void init(){
		saludator.setSaludo("HolaMundo");
		saludator.printSaludo();
	}
}
