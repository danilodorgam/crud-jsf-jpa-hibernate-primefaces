package com.stefanini.service;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import com.stefanini.model.Denunciante;
import com.stefanini.repository.DenuncianteRepository;

@Stateless
public class DenuncianteService {

    @Inject
    private DenuncianteRepository denunciaRepository;

    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public void buscar(Denunciante denunciante){
        denunciaRepository.buscar(denunciante);
    }

}
