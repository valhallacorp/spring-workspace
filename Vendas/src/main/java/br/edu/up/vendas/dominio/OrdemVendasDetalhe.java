package br.edu.up.vendas.dominio;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author lucaslimoni
 *
 */
@Entity
@Table(name = "ordem_vendas_detalhe")
public class OrdemVendasDetalhe {

	@Id
	@GeneratedValue
	private Integer Id;
	
	@Embedded
	@OneToOne
	private OrdemVenda OrdemVenda;
	
	@Column
	private Integer NumRastreamento;
	
	@Column
	private Integer OrdemQTD;
	
	@Embedded
	@ManyToOne
	private Produto Produto;
	
	@Embedded
	@ManyToOne
	private Promocao Promocao;
	
	@Embedded
	@ManyToMany
	private PromocaoProduto PromocaoProduto;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public OrdemVenda getOrdemVenda() {
		return OrdemVenda;
	}

	public void setOrdemVenda(OrdemVenda ordemVenda) {
		OrdemVenda = ordemVenda;
	}

	public Integer getNumRastreamento() {
		return NumRastreamento;
	}

	public void setNumRastreamento(Integer numRastreamento) {
		NumRastreamento = numRastreamento;
	}

	public Integer getOrdemQTD() {
		return OrdemQTD;
	}

	public void setOrdemQTD(Integer ordemQTD) {
		OrdemQTD = ordemQTD;
	}

	public Produto getProduto() {
		return Produto;
	}

	public void setProduto(Produto produto) {
		Produto = produto;
	}

	public Promocao getPromocao() {
		return Promocao;
	}

	public void setPromocao(Promocao promocao) {
		Promocao = promocao;
	}

	public PromocaoProduto getPromocaoProduto() {
		return PromocaoProduto;
	}

	public void setPromocaoProduto(PromocaoProduto promocaoProduto) {
		PromocaoProduto = promocaoProduto;
	}

	
	
	
	
	
	
}
