package com.up.vendas.ModuloVendas.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class Territorio {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long territorioID;
	
	@NotEmpty
	private String nome;
	
	@NotEmpty
	private String codigoPais;
	
	@NotEmpty
	private String grupo;
	
	@NotEmpty
	private String vendasYTD;
	
	@NotEmpty
	private String vendasUltimoAno;
	
	@NotEmpty
	private String custoYTD;
	
	@NotEmpty
	private String custoUltimoAno;
	
	
	
	public long getTerritorioID() {
		return territorioID;
	}

	public void setTerritorioID(long territorioID) {
		this.territorioID = territorioID;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigoPais() {
		return codigoPais;
	}

	public void setCodigoPais(String codigoPais) {
		this.codigoPais = codigoPais;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public String getVendasYTD() {
		return vendasYTD;
	}

	public void setVendasYTD(String vendasYTD) {
		this.vendasYTD = vendasYTD;
	}

	public String getVendasUltimoAno() {
		return vendasUltimoAno;
	}

	public void setVendasUltimoAno(String vendasUltimoAno) {
		this.vendasUltimoAno = vendasUltimoAno;
	}

	public String getCustoYTD() {
		return custoYTD;
	}

	public void setCustoYTD(String custoYTD) {
		this.custoYTD = custoYTD;
	}

	public String getCustoUltimoAno() {
		return custoUltimoAno;
	}

	public void setCustoUltimoAno(String custoUltimoAno) {
		this.custoUltimoAno = custoUltimoAno;
	}
	
	
	
	

}
