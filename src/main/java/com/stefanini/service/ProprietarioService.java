package com.stefanini.service;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import com.stefanini.model.Proprietario;
import com.stefanini.repository.ProprietarioRepository;

@Stateless
public class ProprietarioService implements Serializable {
	@Inject
	private ProprietarioRepository proprietarioRepository;

	// CRIAR

	public void criar(Proprietario proprietario) {

		proprietarioRepository.criar(proprietario);

	}

	// LISTAR
	public List<Proprietario> listar() {
		return proprietarioRepository.listar();
	}
	// EDITAR

	// DELETAR
	public void deletar(Proprietario proprietario) {
		proprietarioRepository.deletar(proprietario);
	}

	public void atualizar(Proprietario proprietario) {
		proprietarioRepository.atualizar(proprietario);
		
	}

	// BUSCAR
	public Proprietario buscar(Proprietario proprietario){
		return proprietarioRepository.buscar(proprietario);
	}

}
