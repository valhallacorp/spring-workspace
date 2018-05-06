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
@Table(name = "ordem_venda")
public class OrdemVenda {
	
	@Id
	@GeneratedValue
	private Integer Id;
	
	@Embedded
	@OneToOne
	private Cliente Cliente;
	
	@Embedded
	@OneToOne
	private Regiao Regiao;
	
	@Embedded
	private CartaoDeCredito CartaoDeCredito;
	
	@Embedded
	@OneToOne
	private Cambio Cambio;
	
	@Column
	private Date DataOrdem;
	
	@Column
	private Date DataVencimento;
	
	@Column
	private Date DataEnvio;
	
	@Column
	private String Status;
	
	@Column
	private String EndCobranca;
	
	@Column
	private String EndEntrega;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Cliente getCliente() {
		return Cliente;
	}

	public void setCliente(Cliente cliente) {
		Cliente = cliente;
	}

	public Regiao getRegiao() {
		return Regiao;
	}

	public void setRegiao(Regiao regiao) {
		Regiao = regiao;
	}

	public CartaoDeCredito getCartaoDeCredito() {
		return CartaoDeCredito;
	}

	public void setCartaoDeCredito(CartaoDeCredito cartaoDeCredito) {
		CartaoDeCredito = cartaoDeCredito;
	}

	public Cambio getCambio() {
		return Cambio;
	}

	public void setCambio(Cambio cambio) {
		Cambio = cambio;
	}

	public Date getDataOrdem() {
		return DataOrdem;
	}

	public void setDataOrdem(Date dataOrdem) {
		DataOrdem = dataOrdem;
	}

	public Date getDataVencimento() {
		return DataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		DataVencimento = dataVencimento;
	}

	public Date getDataEnvio() {
		return DataEnvio;
	}

	public void setDataEnvio(Date dataEnvio) {
		DataEnvio = dataEnvio;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public String getEndCobranca() {
		return EndCobranca;
	}

	public void setEndCobranca(String endCobranca) {
		EndCobranca = endCobranca;
	}

	public String getEndEntrega() {
		return EndEntrega;
	}

	public void setEndEntrega(String endEntrega) {
		EndEntrega = endEntrega;
	}
	
	
	

}
