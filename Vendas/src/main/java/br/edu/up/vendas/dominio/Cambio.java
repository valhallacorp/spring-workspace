package br.edu.up.vendas.dominio;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author lucaslimoni
 *
 */
@Entity
@Table(name = "cambio")
public class Cambio {

	@Id
	@GeneratedValue
	private Integer Id;
	
	@Column
	private Date DataCambio;
	
	@Column
	private Integer CodOrigem;
	
	@Column
	private Integer CodDestino;
	
	@Column
	private String TaxaMedia;
	
	@Column
	private String TaxaFinalDia;
	
	@Embedded
	@OneToOne
	private Moeda Moeda;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Date getDataCambio() {
		return DataCambio;
	}

	public void setDataCambio(Date dataCambio) {
		DataCambio = dataCambio;
	}

	public Integer getCodOrigem() {
		return CodOrigem;
	}

	public void setCodOrigem(Integer codOrigem) {
		CodOrigem = codOrigem;
	}

	public Integer getCodDestino() {
		return CodDestino;
	}

	public void setCodDestino(Integer codDestino) {
		CodDestino = codDestino;
	}

	public String getTaxaMedia() {
		return TaxaMedia;
	}

	public void setTaxaMedia(String taxaMedia) {
		TaxaMedia = taxaMedia;
	}

	public String getTaxaFinalDia() {
		return TaxaFinalDia;
	}

	public void setTaxaFinalDia(String taxaFinalDia) {
		TaxaFinalDia = taxaFinalDia;
	}

	public Moeda getMoeda() {
		return Moeda;
	}

	public void setMoeda(Moeda moeda) {
		Moeda = moeda;
	}
	
	
	
	
	
}
