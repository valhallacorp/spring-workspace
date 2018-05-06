package br.edu.up.vendas.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "razao_vendas")
public class RazaoVendas {
	
	@Id
	@GeneratedValue
	private Integer Id;
	
	@Column
	private String Nome;

}
