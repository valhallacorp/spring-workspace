package com.testejava.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class PessoaController {
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String index() {
		return "nome,idade";
	}

}
