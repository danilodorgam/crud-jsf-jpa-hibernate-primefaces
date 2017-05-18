package com.stefanini.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class TipoTelefone implements Serializable {
	private static final long serialVersionUID = 1L;
	/*
	 *  idTipoTelefone INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  		descricaoTipoTelefone VARCHAR(20) NULL,
	 */
	@Id
	@Column(name ="idTipoTelefone")
	private int idTipoTelefone;
	
	@Column(name ="descricaoTipoTelefone" ,length=20)
	private String descricaoTipoTelefone;

	public int getIdTipoTelefone() {
		return idTipoTelefone;
	}

	public void setIdTipoTelefone(int idTipoTelefone) {
		this.idTipoTelefone = idTipoTelefone;
	}

	public String getDescricaoTipoTelefone() {
		return descricaoTipoTelefone;
	}

	public void setDescricaoTipoTelefone(String descricaoTipoTelefone) {
		this.descricaoTipoTelefone = descricaoTipoTelefone;
	}
	
	
	

}
