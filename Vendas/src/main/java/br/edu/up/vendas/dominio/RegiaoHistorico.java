package br.edu.up.vendas.dominio;

import java.sql.Date;

import javax.persistence.Column;
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
@Table(name = "regiao_historico")
public class RegiaoHistorico {
	
	@Id
	@GeneratedValue
	private Date DataInicio;
	
	@Column
	private Date DataFinal;
	
	
	@Embedded
	@OneToOne
	private Regiao Regiao;
	
	@Embedded
	@OneToOne
	private Vendedor Vendedor;

	//getters and setters
	
	public Date getDataInicio() {
		return DataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		DataInicio = dataInicio;
	}

	public Date getDataFinal() {
		return DataFinal;
	}

	public void setDataFinal(Date dataFinal) {
		DataFinal = dataFinal;
	}

	public Regiao getRegiao() {
		return Regiao;
	}

	public void setRegiao(Regiao regiao) {
		Regiao = regiao;
	}

	public Vendedor getVendedor() {
		return Vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		Vendedor = vendedor;
	}
	
	

}
