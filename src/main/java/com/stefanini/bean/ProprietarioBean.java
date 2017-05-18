package com.stefanini.bean;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Model;
import javax.enterprise.inject.New;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.jms.Session;

import com.stefanini.model.Proprietario;
import com.stefanini.model.Telefone;
import com.stefanini.model.TipoTelefone;
import com.stefanini.service.ProprietarioService;
import com.stefanini.service.TelefoneService;
import com.stefanini.service.TipoTelefoneService;

@ManagedBean
@ViewScoped
//@RequestScoped
public class ProprietarioBean implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private ProprietarioService proprietarioService;
	@Inject
	private TipoTelefoneService tipoTelefoneService;
	@Inject
	private TelefoneService telefoneService;

	@Inject
	private Proprietario proprietario;

	private List<Proprietario> proprietarios;

	private List<TipoTelefone> tiposdeTelefone;
	@Inject
	private Telefone telefone;
	
	@Inject
	@New(value=ArrayList.class)
	//Adicionar o item acima para iniciar um List<>
	private List<Telefone> telefones;

	public void criar() {
		// fazer uma busca em vez de usar FLAG
		// Implementando Sistema de busca descontinuando validação por flag.
		if (proprietarioService.buscar(proprietario) != null) {
			
			proprietarioService.atualizar(getProprietario());
		} else {
//			
//			List<Telefone> fones = new ArrayList<Telefone>();
//			getTelefone().setProprietario(getProprietario());
//			fones.add(getTelefone());
			getProprietario().setTelefones(getTelefones());
			proprietarioService.criar(getProprietario());
		}

	}
	public void insereTelefones(Telefone telefone){
		if(getTelefones()!= null){
			getTelefone().setProprietario(getProprietario());
			getTelefones().add(getTelefone());
			setTelefone(new Telefone());
		}
	}

	public String editar(Proprietario proprietario) {

		setProprietario(proprietario);
		//setTelefones(telefoneService.buscar(getProprietario()));
		if(getTelefone() != null){
			getTelefone().setProprietario(getProprietario());
			List<Telefone> fones = new ArrayList<Telefone>();
			fones.add(getTelefone());
			getProprietario().setTelefones(fones);
			
		}
		return "inserirProprietario.xhtml";
	}

	public List<Proprietario> listar() {
		if (proprietarios == null)
			proprietarios = proprietarioService.listar();
		return proprietarios;
	}

	public void deletar(Proprietario proprietario) {
		proprietarios.remove(proprietario);
		proprietarioService.deletar(proprietario);
	}

	public List<TipoTelefone> listarTipoTelefone() {
		if (getTiposdeTelefone() == null)
			setTiposdeTelefone(tipoTelefoneService.listar());
		return getTiposdeTelefone();
	}
	// GETS SETS

	public Proprietario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}

	public List<Proprietario> getProprietarios() {
		return proprietarios;
	}

	public void setProprietarios(List<Proprietario> proprietarios) {
		proprietarios = proprietarios;
	}

	public List<TipoTelefone> getTiposdeTelefone() {
		return tiposdeTelefone;
	}

	public void setTiposdeTelefone(List<TipoTelefone> tiposdeTelefone) {
		this.tiposdeTelefone = tiposdeTelefone;
	}

	public TipoTelefoneService getTipoTelefoneService() {
		return tipoTelefoneService;
	}

	public void setTipoTelefoneService(TipoTelefoneService tipoTelefoneService) {
		this.tipoTelefoneService = tipoTelefoneService;
	}

	public Telefone getTelefone() {
		if (telefone == null) {
			setTelefone(new Telefone());
		}
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		if(getTelefones() == null){
			this.telefones = telefones;
		}
	}
	

}
