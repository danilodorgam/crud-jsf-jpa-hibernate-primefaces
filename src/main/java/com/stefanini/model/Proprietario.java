package com.stefanini.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Embeddable
public class Proprietario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "cpfProprietario")
	private Long cpfProprietario;

	@Column(name = "nome", length = 100)
	private String nome;

	@Column(name = "endereco", length = 100)
	private String endereco;

	@Column(name = "bairro", length = 100)
	private String bairro;

	@Column(name = "cidade", length = 100)
	private String cidade;

	@Column(name = "uf", length = 2)
	private String uf;

	@Column(name = "sexo", length = 1)
	private String sexo;

	@Column(name = "dtNascimento")
	@Temporal(TemporalType.DATE)
	private Date dataNascimento;
	
	@OneToMany(cascade={CascadeType.PERSIST, CascadeType.REMOVE}, mappedBy="proprietario")
	private List<Telefone> telefones;
	

	
	
	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

	public Long getCpfProprietario() {
		return cpfProprietario;
	}

	public void setCpfProprietario(Long cpfProprietario) {
		this.cpfProprietario = cpfProprietario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return "Proprietario [cpfProprietario=" + cpfProprietario + ", nome=" + nome + ", endereco=" + endereco
				+ ", bairro=" + bairro + ", cidade=" + cidade + ", uf=" + uf + ", sexo=" + sexo + ", dataNascimento="
				+ dataNascimento + "]";
	}

}
