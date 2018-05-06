package br.edu.up.vendas.dominio;

import java.sql.Date;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author lucaslimoni
 *
 */
@Entity
@Table(name = "vendedor_historico")
public class VendedorHistorico {
	
	@Id
	@GeneratedValue
	private Date DataVenda;
	
	@Embedded
	@OneToOne
	private Vendedor Vendedor;

	//getters and setters
	
	public Date getDataVenda() {
		return DataVenda;
	}

	public void setDataVenda(Date dataVenda) {
		DataVenda = dataVenda;
	}

	public Vendedor getVendedor() {
		return Vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		Vendedor = vendedor;
	}
	
	

}
