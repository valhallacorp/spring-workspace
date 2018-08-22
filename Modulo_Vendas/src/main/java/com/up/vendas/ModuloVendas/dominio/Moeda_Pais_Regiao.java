package com.up.vendas.ModuloVendas.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Moeda_Pais_Regiao {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long moedaPaisRegiaoID;
	
	@OneToOne
	private Moeda moeda;

	public long getMoedaPaisRegiaoID() {
		return moedaPaisRegiaoID;
	}

	public void setMoedaPaisRegiaoID(long moedaPaisRegiaoID) {
		this.moedaPaisRegiaoID = moedaPaisRegiaoID;
	}

	public Moeda getMoeda() {
		return moeda;
	}

	public void setMoeda(Moeda moeda) {
		this.moeda = moeda;
	}
	
	
	
}
