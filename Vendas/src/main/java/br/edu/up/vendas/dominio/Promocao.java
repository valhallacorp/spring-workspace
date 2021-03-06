package br.edu.up.vendas.dominio;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "promocao")
public class Promocao {
	
	@Id
	@GeneratedValue
	private Integer Id;
	
	@Column
	private String Descricao;
	
	@Column
	private String Desconto;
	
	@Column
	private String Tipo;
	
	@Column
	private String Categoria;
	
	@Column
	private Date DataInicio;
	
	@Column
	private Date DataFinal;
	
	@Column
	private Integer QTDmin;
	
	@Column
	private Integer QTDmax;

	
	//getters and setters
	
	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

	public String getDesconto() {
		return Desconto;
	}

	public void setDesconto(String desconto) {
		Desconto = desconto;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public String getCategoria() {
		return Categoria;
	}

	public void setCategoria(String categoria) {
		Categoria = categoria;
	}

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

	public Integer getQTDmin() {
		return QTDmin;
	}

	public void setQTDmin(Integer qTDmin) {
		QTDmin = qTDmin;
	}

	public Integer getQTDmax() {
		return QTDmax;
	}

	public void setQTDmax(Integer qTDmax) {
		QTDmax = qTDmax;
	}
	
	

}
