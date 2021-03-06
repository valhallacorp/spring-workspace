package br.edu.up.vendas.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author lucaslimoni
 *
 */
@Entity
@Table(name = "cartao_de_credito")
public class CartaoDeCredito {
	
	@Id
	@GeneratedValue
	private Integer Id;
	
	@Column
	private String Tipo;
	
	
	@Column
	private Integer Numero;


	// getters and setters
	
	
	public Integer getId() {
		return Id;
	}


	public void setId(Integer id) {
		Id = id;
	}


	public String getTipo() {
		return Tipo;
	}


	public void setTipo(String tipo) {
		Tipo = tipo;
	}


	public Integer getNumero() {
		return Numero;
	}


	public void setNumero(Integer numero) {
		Numero = numero;
	}

	
	
	
}
