package com.stefanini.repository;

import java.io.Serializable;
import java.util.List;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import com.stefanini.model.Proprietario;
import com.stefanini.model.Telefone;
import com.stefanini.util.EntityManagerProducer;

public class TelefoneRepository implements Serializable {

	@Inject
	private EntityManager manager;

	
	public List<Telefone> buscar(Proprietario proprietario) {
		//return this.manager.find(Telefone.class, proprietario.getCpfProprietario());
		return this.manager.createQuery("Select p from Telefone p WHERE  in :cpfProprietario").setParameter("cpfProprietario",proprietario.getCpfProprietario()).getResultList();

	}




}
