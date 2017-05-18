package com.stefanini.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


/*
 * http://www.universidadejava.com.br/materiais/jpa-chave-primaria-composta/
 */
@Entity
@IdClass(TelefonePK.class)
public class Telefone {
	@Id
	private Integer ddd;
	@Id
	private Integer numero;
	@Id
	@ManyToOne
	@JoinColumn(name="cpfProprietario", insertable=false, updatable=false)
	private Proprietario proprietario;
	


	private Integer idTipoTelefone;


	public Integer getDdd() {
		return ddd;
	}


	public void setDdd(Integer ddd) {
		this.ddd = ddd;
	}


	public Integer getNumero() {
		return numero;
	}


	public void setNumero(Integer numero) {
		this.numero = numero;
	}


	public Proprietario getProprietario() {
		return proprietario;
	}


	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}


	public Integer getTipoTelefone() {
		return idTipoTelefone;
	}


	public void setTipoTelefone(Integer tipoTelefone) {
		this.idTipoTelefone = tipoTelefone;
	}
	
	

}
