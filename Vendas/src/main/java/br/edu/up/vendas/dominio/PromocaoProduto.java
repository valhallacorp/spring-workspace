package br.edu.up.vendas.dominio;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 * @author lucaslimoni
 *
 */
@Embeddable
public class PromocaoProduto {
	
	@Embedded
	@OneToMany
	private Promocao Promocao;
	
	@Embedded
	@ManyToMany
	private Produto Produto;

	public Promocao getPromocao() {
		return Promocao;
	}

	public void setPromocao(Promocao promocao) {
		Promocao = promocao;
	}

	public Produto getProduto() {
		return Produto;
	}

	public void setProduto(Produto produto) {
		Produto = produto;
	}
	
	

}
