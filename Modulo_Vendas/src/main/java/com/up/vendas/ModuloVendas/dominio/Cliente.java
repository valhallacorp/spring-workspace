package com.up.vendas.ModuloVendas.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;


@Entity
public class Cliente {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long clienteID;
	@NotEmpty
	private long pessoaID;
	@NotEmpty
	private String nome;
	
	
	public Cliente() {
	}

	public Cliente(long pessoaID, String nome) {
		super();
		this.pessoaID = pessoaID;
		this.nome = nome;
	}
	
	public long getClienteID() {
		return clienteID;
	}
	public void setClienteID(long clienteID) {
		this.clienteID = clienteID;
	}
	public long getPessoaID() {
		return pessoaID;
	}
	public void setPessoaID(long pessoaID) {
		this.pessoaID = pessoaID;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (clienteID ^ (clienteID >>> 32));
		result = prime * result + (int) (pessoaID ^ (pessoaID >>> 32));
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (clienteID != other.clienteID)
			return false;
		if (pessoaID != other.pessoaID)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + clienteID + ", idPessoa=" + pessoaID + ", nome=" + nome + "]";
	}
	

}
