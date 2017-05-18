package com.stefanini.repository;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.stefanini.model.Denunciante;

public class DenuncianteRepository {

	@Inject
	private EntityManager manager;

	public Denunciante buscar(Denunciante denunciante) {
		return this.manager.find(Denunciante.class, denunciante.getId());
	}

}




