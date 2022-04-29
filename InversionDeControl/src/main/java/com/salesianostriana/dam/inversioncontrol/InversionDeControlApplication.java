package com.salesianostriana.dam.inversioncontrol;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InversionDeControlApplication {

	public static void main(String[] args) {
		SpringApplication.run(InversionDeControlApplication.class, args);
	
	}
	//lmlopezmagana
		
	@Bean
	public CommandLineRunner init(ApplicationContext ctx) {
		return args -> {
			Arrays.stream(ctx.getBeanDefinitionNames()).forEach(System.out::println);
		};
	}
		
	

}
