package com.up.vendas.ModuloVendas.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class ProdutoVendas {
	
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long produtoVendasID;
	@NotEmpty
	private long produtoID;
	@NotEmpty
	private String nome;
	@NotEmpty
	private double valor;
	
	public ProdutoVendas() {
		
	}
	
	public ProdutoVendas(long produtoID, String nome, long valor) {
		super();
		this.produtoID = produtoID;
		this.nome = nome;
		this.valor = valor;
	}
	
	
	public long getProdutoVendasID() {
		return produtoVendasID;
	}
	public void setProdutoVendasID(long produtoVendasID) {
		this.produtoVendasID = produtoVendasID;
	}
	public long getProdutoID() {
		return produtoID;
	}
	public void setProdutoID(long produtoID) {
		this.produtoID = produtoID;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	@Override
	public String toString() {
		return "ProdutoVendido [id=" + produtoVendasID + ", idProduto=" + produtoID + ", valor=" + valor + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + (int) (produtoID ^ (produtoID >>> 32));
		result = prime * result + (int) (produtoVendasID ^ (produtoVendasID >>> 32));
		long temp;
		temp = Double.doubleToLongBits(valor);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProdutoVendas other = (ProdutoVendas) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (produtoID != other.produtoID)
			return false;
		if (produtoVendasID != other.produtoVendasID)
			return false;
		if (Double.doubleToLongBits(valor) != Double.doubleToLongBits(other.valor))
			return false;
		return true;
	}

	
	
	
	
	
}
