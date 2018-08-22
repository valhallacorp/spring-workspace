package com.up.vendas.ModuloVendas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.up.vendas.ModuloVendas.dominio.Cliente;
import com.up.vendas.ModuloVendas.dominio.ProdutoVendas;
import com.up.vendas.ModuloVendas.dominio.Venda;
import com.up.vendas.ModuloVendas.repository.ClienteRepository;
import com.up.vendas.ModuloVendas.repository.ProdutoRepository;
import com.up.vendas.ModuloVendas.repository.VendaRepository;

@Service
public class VendasService {
	
	@Autowired
	public VendaRepository vr;
	
	@Autowired
	public ProdutoRepository pr;
	
	@Autowired
	public ClienteRepository cr;

	
	public Iterable<Cliente> listarClientes(){
		return cr.findAll();
	}
	
	public Iterable<ProdutoVendas> listarProdutosVendidos(){
		return pr.findAll();
	}
	
	public Iterable<ProdutoVendas> listarProdutos(){
		return pr.findAll(); 
	}
	
	public void salvarVenda(Cliente cliente, ProdutoVendas produto) {
		cr.save(cliente);
		pr.save(produto);
		
		Venda venda = new Venda(cliente, produto);
		vr.save(venda);
		
	}
	
}
