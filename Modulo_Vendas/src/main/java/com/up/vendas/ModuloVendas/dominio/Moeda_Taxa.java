package com.up.vendas.ModuloVendas.dominio;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Moeda_Taxa {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long moedaTaxaID;
	
	private Date moedaTaxaData;
	
	private String codigoMoedaEmbarque;

	private String codigoMoedaDestino;
	
	private String taxaMedia;
	
	private String taxaFinalDia;

	public long getMoedaTaxaID() {
		return moedaTaxaID;
	}

	public void setMoedaTaxaID(long moedaTaxaID) {
		this.moedaTaxaID = moedaTaxaID;
	}

	public Date getMoedaTaxaData() {
		return moedaTaxaData;
	}

	public void setMoedaTaxaData(Date moedaTaxaData) {
		this.moedaTaxaData = moedaTaxaData;
	}

	public String getCodigoMoedaEmbarque() {
		return codigoMoedaEmbarque;
	}

	public void setCodigoMoedaEmbarque(String codigoMoedaEmbarque) {
		this.codigoMoedaEmbarque = codigoMoedaEmbarque;
	}

	public String getCodigoMoedaDestino() {
		return codigoMoedaDestino;
	}

	public void setCodigoMoedaDestino(String codigoMoedaDestino) {
		this.codigoMoedaDestino = codigoMoedaDestino;
	}

	public String getTaxaMedia() {
		return taxaMedia;
	}

	public void setTaxaMedia(String taxaMedia) {
		this.taxaMedia = taxaMedia;
	}

	public String getTaxaFinalDia() {
		return taxaFinalDia;
	}

	public void setTaxaFinalDia(String taxaFinalDia) {
		this.taxaFinalDia = taxaFinalDia;
	}
	
	
	
	
}
