package com.eventoapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;

@Entity
public class Convidado {
	
	@Id
	@NotEmpty
	private String rg;
	
	@NotEmpty
	private String nomeConvidado;
	
	@ManyToOne
	private Evento evento; 
	
	
	
	public Evento getEvento() {
		return evento;
	}
	public void setEvento(Evento evento) {
		this.evento = evento;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getnomeConvidado() {
		return nomeConvidado;
	}
	public void setnomeConvidado(String nomeConvidado) {
		this.nomeConvidado = nomeConvidado;
	}
	
	

}
