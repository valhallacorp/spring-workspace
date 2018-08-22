package com.up.vendas.ModuloVendas.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class Moeda {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long moedaID;
	
	@NotEmpty
	private String nome;

	public long getMoedaID() {
		return moedaID;
	}

	public void setMoedaID(long moedaID) {
		this.moedaID = moedaID;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
