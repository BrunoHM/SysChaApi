package com.murta.senai.tcc.halcApi.services.Pessoa;

import java.util.List;

import com.murta.senai.tcc.halcApi.entities.Pessoa;

public interface PessoaService {
	
	Pessoa save(Pessoa objPessoa);
	
	Pessoa findById(Long idPessoa);
	
	List<Pessoa> getAllPessoa();
		
	List<Pessoa> findByNome(String nomePessoa);
	
	List<Pessoa> findBySobreNome(String sobreNomePessoa);
		
}
