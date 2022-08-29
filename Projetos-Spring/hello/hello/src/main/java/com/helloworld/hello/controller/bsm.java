package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm")

public class bsm {

	
	@GetMapping
	public String bsm() {
		return "Mentalidades:"
				+ "\nResponsabilidade Pessoal"
				+ "\nOrientação ao Futuro"
				+ "\nMentalidade de Crescimento "
				+ "\nPersistência\n"
				+ "\nHabilidades:"
				+ "\nTrabalho em Equipe"
				+ "\nAtenção aos Detalhes"
				+ "\nProatividade"
				+ "\nComunicação";
	}
}
