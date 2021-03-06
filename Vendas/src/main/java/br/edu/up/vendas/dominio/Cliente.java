package br.edu.up.vendas.dominio;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author lucaslimoni
 *
 */
@Entity
@Table(name = "cliente")
public class Cliente {
	
	@Id
	@GeneratedValue
	private Integer Id;
	@Column
	//private Pessoa Pessoa;
	
	//@Column
	private String ContaNumero;
	
	@Column
	private Loja Loja;
	
	@Embedded
	@OneToMany
	private Regiao Regiao;
	
	//getters and setters

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getContaNumero() {
		return ContaNumero;
	}

	public void setContaNumero(String contaNumero) {
		ContaNumero = contaNumero;
	}

	public Loja getLoja() {
		return Loja;
	}

	public void setLoja(Loja loja) {
		Loja = loja;
	}

	public Regiao getRegiao() {
		return Regiao;
	}

	public void setRegiao(Regiao regiao) {
		Regiao = regiao;
	}

	
	
}
