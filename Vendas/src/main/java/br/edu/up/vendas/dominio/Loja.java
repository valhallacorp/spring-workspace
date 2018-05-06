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
@Table(name = "lojas")
public class Loja {
	
	
	@Id
	@GeneratedValue
	private Integer Id;
	
	@Column
	private String Nome;
	
	
	//Getters and Setters

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

	
	
	
}
