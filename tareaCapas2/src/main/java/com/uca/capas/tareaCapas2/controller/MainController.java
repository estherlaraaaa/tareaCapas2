package com.uca.capas.tareaCapas2.controller;

import java.time.LocalDate;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
 

@Controller
public class MainController {

	@RequestMapping("/tareaCapas2")
	public @ResponseBody String tareaCapas2() {
		String nombre = "Nombre: Esther María"; 
		String apellido = "Apellido: Lara García";
		String carnet = "Carnert: 00049717";
		String carrera = "Carrera: Ingeniería Informática"; 
		String año = "Año cursado: 4to año , La hora es: " ;
		return nombre + "\n" + apellido + "\n" + carnet + "\n" + carrera + "\n" + año.concat(Calendar.getInstance().getTime().toString());
	}
	
	@RequestMapping("/parametro")
	public @ResponseBody String parametro(HttpServletRequest request) {
		Integer param1 = Integer.parseInt(request.getParameter("dia"));
		Integer param2 = Integer.parseInt(request.getParameter("mes"));
		Integer param3 = Integer.parseInt(request.getParameter("año"));
		
		LocalDate boom = LocalDate.of(param3, param2, param1);
		
		return "Dia de la semana es : " + boom.getDayOfWeek();
	}
}
