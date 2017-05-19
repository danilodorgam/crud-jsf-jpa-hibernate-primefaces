package com.stefanini.service;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import com.stefanini.model.Proprietario;
import com.stefanini.model.Telefone;

import com.stefanini.repository.TelefoneRepository;

@Stateless
public class TelefoneService implements Serializable {
	@Inject
	private TelefoneRepository telefoneRepository;

	
	// BUSCAR
	public List<Telefone> buscar(Proprietario proprietario){
		return telefoneRepository.buscar(proprietario);
	}

}
