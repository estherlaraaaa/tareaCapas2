package com.uca.capas.tareaCapas2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



// especifica que este es un proyecto Spring Boot, y
//de esta manera realiza todas las configuraciones necesarias de manera automática para que (en este caso) Spring
//MVC funcione correctamente. 

@SpringBootApplication 
public class TareaCapas2Application {

	public static void main(String[] args) {
		SpringApplication.run(TareaCapas2Application.class, args);
	}

}
