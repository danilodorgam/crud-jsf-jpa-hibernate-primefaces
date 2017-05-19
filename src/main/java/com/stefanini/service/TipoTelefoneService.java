package com.stefanini.service;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import com.stefanini.model.Proprietario;
import com.stefanini.model.TipoTelefone;

import com.stefanini.repository.TipoTelefoneRepository;

@Stateless
public class TipoTelefoneService implements Serializable {
	@Inject
	private TipoTelefoneRepository tipoTelefoneRepository;


	public List<TipoTelefone> listar() {
		return tipoTelefoneRepository.listar();
	}

}
