package br.edu.up.vendas.dominio;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;


/**
 * @author lucaslimoni
 *
 */
@Embeddable
public class Pessoa {
	
	@Column
	private Integer CPF;
	
	@Column
	private Integer RG;
	
	@Column
	private String Nome;
	
	@Column
	private Date Nascimento;
	
	//getters and setters

	public Integer getCPF() {
		return CPF;
	}

	public void setCPF(Integer cPF) {
		CPF = cPF;
	}

	public Integer getRG() {
		return RG;
	}

	public void setRG(Integer rG) {
		RG = rG;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public Date getNascimento() {
		return Nascimento;
	}

	public void setNascimento(Date nascimento) {
		Nascimento = nascimento;
	}

	
	
}
