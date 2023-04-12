package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello") //endereço do recurso: localhost:8080/hello
public class HelloController {
	
	@GetMapping
	public String hello() {
		return "<b>Hello Turma 62!!!</b>";
	}
	
	@GetMapping("/nome")
	public String meuNome() {
		return "<b>Brenda está aqui!!!</b>";
	}
	
	
	
}
