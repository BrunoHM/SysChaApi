package com.murta.senai.tcc.halcApi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.murta.senai.tcc.halcApi.entities.Pessoa;
import com.murta.senai.tcc.halcApi.services.Pessoa.PessoaService;

@RestController
public class PessoaController {

	@Autowired
	private PessoaService pessoaService;
	
	@GetMapping(path = "/insertPessoa")
	public Pessoa save(@RequestBody Pessoa objPessoa) {
		return pessoaService.save(objPessoa);
	}
}
