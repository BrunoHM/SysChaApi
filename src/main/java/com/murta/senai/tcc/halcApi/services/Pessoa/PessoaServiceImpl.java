package com.murta.senai.tcc.halcApi.services.Pessoa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.murta.senai.tcc.halcApi.entities.Pessoa;
import com.murta.senai.tcc.halcApi.repositories.PessoaRepository;

@Service
public class PessoaServiceImpl implements PessoaService {

	@Autowired
	PessoaRepository pessoaRepository;

	@Override
	public Pessoa save(Pessoa objPessoa) {
		return pessoaRepository.save(objPessoa);
	}

	@Override
	public Pessoa findById(Long idPessoa) {
		Optional<Pessoa> objPessoa = pessoaRepository.findById(idPessoa);
		if(objPessoa.isPresent()) {
			return objPessoa.get();
		}else {
			return null;
		}
	}

	@Override
	public List<Pessoa> getAllPessoa() {
		return pessoaRepository.findAll();
	}

	@Override
	public List<Pessoa> findByNome(String nomePessoa) {
		return pessoaRepository.findByNome(nomePessoa);
	}

	@Override
	public List<Pessoa> findBySobreNome(String sobreNomePessoa) {
		return pessoaRepository.findBySobreNome(sobreNomePessoa);
	}
}
