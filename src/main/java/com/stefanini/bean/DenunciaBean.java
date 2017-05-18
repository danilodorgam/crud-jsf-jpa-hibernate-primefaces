package com.stefanini.bean;


import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.stefanini.model.Tipo;
import com.stefanini.service.DenuncianteService;
import java.io.Serializable;

@Named("denunciaMB")
@SessionScoped
public class DenunciaBean implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
    private DenuncianteService denuncianteService;
    
    @Inject
    private Tipo tipo;
    
    public Tipo getTipo() {
    	if(tipo == null){
    		tipo = new Tipo();
    	}
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}


	public String chamar() {
//		tipo.setDescricao("teste aqui");
    System.out.println("TIPO:"+ tipo.getDescricao());
        return "/pages/teste.faces?faces-redirect=true";
    }

}
