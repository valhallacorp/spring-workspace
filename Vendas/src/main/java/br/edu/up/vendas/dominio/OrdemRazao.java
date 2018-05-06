package br.edu.up.vendas.dominio;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.OneToOne;

/**
 * @author lucaslimoni
 *
 */
@Embeddable
public class OrdemRazao {
	
	@Embedded
	@OneToOne
	private OrdemVenda OrdemVenda;
	
	@Embedded
	@OneToOne
	private RazaoVendas RazaoVendas;

	public OrdemVenda getOrdemVenda() {
		return OrdemVenda;
	}

	public void setOrdemVenda(OrdemVenda ordemVenda) {
		OrdemVenda = ordemVenda;
	}

	public RazaoVendas getRazaoVendas() {
		return RazaoVendas;
	}

	public void setRazaoVendas(RazaoVendas razaoVendas) {
		RazaoVendas = razaoVendas;
	}
	
	
	
	

}
