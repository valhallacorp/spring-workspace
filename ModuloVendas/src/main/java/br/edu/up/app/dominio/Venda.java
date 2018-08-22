package br.edu.up.app.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Venda {
	
	@Id
	@GeneratedValue
	private long id;
	
	@OneToOne
	ProdutoVendas produto;
	
	@OneToOne
	Cliente cliente;
	
	public Venda(Cliente cliente, ProdutoVendas produto) {
		super();
		this.cliente = cliente;
		this.produto = produto;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Venda() {
	}

	public Venda(ProdutoVendas produto) {
		super();
		this.produto = produto;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public ProdutoVendas getProduto() {
		return produto;
	}

	public void setProduto(ProdutoVendas produto) {
		this.produto = produto;
	}

	@Override
	public String toString() {
		return "Venda [id=" + id + ", produto=" + produto + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
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
		if (id != other.id)
			return false;
		if (produto == null) {
			if (other.produto != null)
				return false;
		} else if (!produto.equals(other.produto))
			return false;
		return true;
	}
}
