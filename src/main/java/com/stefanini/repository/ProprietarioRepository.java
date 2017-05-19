package com.stefanini.repository;

import java.io.Serializable;
import java.util.List;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import com.stefanini.model.Proprietario;
import com.stefanini.util.EntityManagerProducer;

public class ProprietarioRepository implements Serializable {

	@Inject
	private EntityManager manager;

	public void criar(Proprietario proprietario) {
		try {

			this.manager.persist(proprietario);

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public List<Proprietario> listar() {
		return this.manager.createQuery("Select p from Proprietario p").getResultList();

	}

	public void deletar(Proprietario propretario) {
		Proprietario tmp = this.manager.merge(propretario);
		this.manager.remove(tmp);
	}
	
	public void atualizar(Proprietario proprietario){
		this.manager.merge(proprietario);
		this.manager.flush();
	}
	
	public Proprietario buscar(Proprietario proprietario) {
		return this.manager.find(Proprietario.class, proprietario.getCpfProprietario());
	}

}
