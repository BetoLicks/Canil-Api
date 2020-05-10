package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Animais;

@RestController
@RequestMapping("/api")
public class AnimaisController {
	
	@Autowired
	private Animais animais;
	
	@GetMapping(value="/lista")
	public Animais listaAnimais() {
		animais.setCodigo("1");
		animais.setNome("TOTÓ");
		
		return animais;
	}

	@GetMapping("/exclui/{codigo}")
	public String excluiAnimal(@PathVariable("codigo") String codigo) {
		return "REGISTRO EXCLUIDO COM SUCESSO";		
	}

	@GetMapping("/retornaum/{codigo}")
	public String retornaUm(@PathVariable("codigo") String codigo) {
		return "REGISTRO ENCONTRADO COM SUCESSO";
	}	
}
