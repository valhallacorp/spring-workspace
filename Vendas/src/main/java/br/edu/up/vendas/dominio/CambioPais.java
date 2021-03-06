package br.edu.up.vendas.dominio;

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
@Table(name = "cambio_pais")
public class CambioPais {
	
	@Id
	@GeneratedValue
	private Integer Id;
	
	@Embedded
	private Moeda Moeda;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Moeda getMoeda() {
		return Moeda;
	}

	public void setMoeda(Moeda moeda) {
		Moeda = moeda;
	}
	
	

}
