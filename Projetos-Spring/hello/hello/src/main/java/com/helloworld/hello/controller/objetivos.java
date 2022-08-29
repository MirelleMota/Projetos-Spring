package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class objetivos {

	
	@GetMapping
	public String objetivos() {
		return "Objetivos:"
				+ "\nEntender a Lógica do Spring Boot"
				+ "\nManter o Foco"
				+ "\nContinuar Estudando "
				+ "\nNão Desistir";
	}
}
