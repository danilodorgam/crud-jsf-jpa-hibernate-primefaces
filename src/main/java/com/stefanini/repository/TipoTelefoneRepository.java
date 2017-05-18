package com.stefanini.repository;

import java.io.Serializable;
import java.util.List;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.stefanini.model.Proprietario;
import com.stefanini.model.TipoTelefone;
import com.stefanini.util.EntityManagerProducer;

public class TipoTelefoneRepository implements Serializable {

	@Inject
	private EntityManager manager;

	
	public List<TipoTelefone> listar() {
		return this.manager.createQuery("Select p from TipoTelefone p").getResultList();

	}

}
