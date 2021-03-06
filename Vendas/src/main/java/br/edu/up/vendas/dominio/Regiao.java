package br.edu.up.vendas.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

@Entity
@Table(name = "regiao")
public class Regiao {
	
	@Id
	@GeneratedValue
	private Integer Id;
	
	@Column
	private String Nome;
	
	@Column
	private Integer DDD;
	
	@Column
	private String Grupo;
	
	@Column
	private String VendasTA; //total de vendas anual
	
	@Column
	private String VendasUA; // total de vendas ultimo ano
	
	@Column
	private String CustoTA; //custo total anual
	
	@Column
	private String CustoUA; // custo total ultimo ano
	
	
	// Getters and Setters

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public Integer getDDD() {
		return DDD;
	}

	public void setDDD(Integer dDD) {
		DDD = dDD;
	}

	public String getGrupo() {
		return Grupo;
	}

	public void setGrupo(String grupo) {
		Grupo = grupo;
	}

	public String getVendasTA() {
		return VendasTA;
	}

	public void setVendasTA(String vendasTA) {
		VendasTA = vendasTA;
	}

	public String getVendasUA() {
		return VendasUA;
	}

	public void setVendasUA(String vendasUA) {
		VendasUA = vendasUA;
	}

	public String getCustoTA() {
		return CustoTA;
	}

	public void setCustoTA(String custoTA) {
		CustoTA = custoTA;
	}

	public String getCustoUA() {
		return CustoUA;
	}

	public void setCustoUA(String custoUA) {
		CustoUA = custoUA;
	}
	
	
	
	
	

}
