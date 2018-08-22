package com.up.vendas.ModuloVendas.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Venda {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long vendaID;
	
	@OneToOne
	ProdutoVendas produto;
	
	@OneToOne
	Cliente cliente;
	
	public Venda(Cliente cliente, ProdutoVendas produto) {
		super();
		this.produto = produto;
		this.cliente = cliente;
	}

	public long getVendaID() {
		return vendaID;
	}

	public void setVendaID(long vendaID) {
		this.vendaID = vendaID;
	}

	public ProdutoVendas getProduto() {
		return produto;
	}

	public void setProduto(ProdutoVendas produto) {
		this.produto = produto;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (vendaID ^ (vendaID >>> 32));
		result = prime * result + ((produto == null) ? 0 : produto.hashCode());
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
		Venda other = (Venda) obj;
		if (vendaID != other.vendaID)
			return false;
		if (produto == null) {
			if (other.produto != null)
				return false;
		} else if (!produto.equals(other.produto))
			return false;
		return true;
	}
	
	
}
