package br.edu.up.vendas.dominio;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * @author lucaslimoni
 *
 */
@Entity
@Table(name = "vendas_item")
public class VendasItem {
	
	@Id
	@GeneratedValue
	private Integer Id;
	
	@Embedded
	@OneToMany
	private Produto Produto;
	
	@Column
	private Integer QTD;
	
	@Column
	private Date DataCompra;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Produto getProduto() {
		return Produto;
	}

	public void setProduto(Produto produto) {
		Produto = produto;
	}

	public Integer getQTD() {
		return QTD;
	}

	public void setQTD(Integer qTD) {
		QTD = qTD;
	}

	public Date getDataCompra() {
		return DataCompra;
	}

	public void setDataCompra(Date dataCompra) {
		DataCompra = dataCompra;
	}
	
	
	

}
