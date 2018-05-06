package br.edu.up.vendas.dominio;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author lucaslimoni
 *
 */
@Entity
@Table(name = "pessoa_cartao_de_credito")
public class PessoaCartaoDeCredito {
	
	@Column
	private CartaoDeCredito CartaoDeCredito;
	
	@Id
	@Embedded
	private Loja Loja;

	//getters and setters
	
	public CartaoDeCredito getCartaoDeCredito() {
		return CartaoDeCredito;
	}

	public void setCartaoDeCredito(CartaoDeCredito cartaoDeCredito) {
		CartaoDeCredito = cartaoDeCredito;
	}

	public Loja getLoja() {
		return Loja;
	}

	public void setLoja(Loja loja) {
		Loja = loja;
	}
	
	

}
