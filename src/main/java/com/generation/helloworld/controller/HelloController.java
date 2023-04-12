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
	
	@GetMapping("/bsm")
	public String bsm() {
		return "<b>BSM's Generation:<br>"
				+ "<br>Mentalidade de Crescimento;<br>"
				+ "<br>Persistência;<br>"
				+ "<br>Responsabilidade Pessoal;<br>"
				+ "<br>Orientação ao Futuro;<br>"
				+ "<br>Comunicação;<br>"
				+ "<br>Orientação ao Detalhe;<br>"
				+ "<br>Proatividade;<br>"
				+ "<br>Trabalho em Equipe<br></b>";
	}
	
	@GetMapping("/objetivos")
	public String objetivosAprendizagem() {
		return "<b>Meus objetivos de aprendizagem da semana:<br>"
				+ "<br>- Melhorar a orientação ao detalhe através de uma revisão cuidadosa de cada exercício feito;<br>"
				+ "<br>- Aprender a usar o método pomodoro para aprimorar o foco na realização das tarefas;<br>"
				+ "<br>- Praticar a meta SMART de estudar 1h todos os dias;<br></b>";
	}
	
	
	
}
