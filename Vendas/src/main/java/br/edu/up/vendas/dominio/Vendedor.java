package br.edu.up.vendas.dominio;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author lucaslimoni
 *
 */
@Entity
@Table(name = "vendedor")
public class Vendedor {
	@Id
	@GeneratedValue
	@Embedded
	private Loja Loja;
	
	@Column
	private Integer QTDvendas;
	
	@Column
	private String Bonus;
	
	@Column
	private String Comissao;
	
	@Column
	private String VendasTA; //Vendas total anual
	
	@Column
	private String VendasUA; //vendas total Ultimo ano
	
	// getters and setters

	public Loja getLoja() {
		return Loja;
	}

	public void setLoja(Loja loja) {
		Loja = loja;
	}

	public Integer getQTDvendas() {
		return QTDvendas;
	}

	public void setQTDvendas(Integer qTDvendas) {
		QTDvendas = qTDvendas;
	}

	public String getBonus() {
		return Bonus;
	}

	public void setBonus(String bonus) {
		Bonus = bonus;
	}

	public String getComissao() {
		return Comissao;
	}

	public void setComissao(String comissao) {
		Comissao = comissao;
	}

	public String getVendasTA() {
		return VendasTA;
	}

	public void setVendasTA(String vendasTA) {
		VendasTA = vendasTA;
	}

	public String getVendasUA() {
		return VendasUA;
	}

	public void setVendasUA(String vendasUA) {
		VendasUA = vendasUA;
	}

	
	
}
