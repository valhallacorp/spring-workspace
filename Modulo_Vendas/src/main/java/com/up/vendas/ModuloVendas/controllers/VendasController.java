package com.up.vendas.ModuloVendas.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.client.RestTemplate;

import com.up.vendas.ModuloVendas.dominio.Cliente;
import com.up.vendas.ModuloVendas.dominio.ProdutoVendas;
import com.up.vendas.ModuloVendas.repository.ClienteRepository;
import com.up.vendas.ModuloVendas.repository.ProdutoRepository;


@RepositoryRestController
public class VendasController {
	
	@Autowired
	public ClienteRepository cr;
	
	@Autowired
	public ProdutoRepository pr;
	
	
	private final String srvPessoas = "http://localhost:8080/pessoas";
	private final String srvProdutos = "http://localhost:8081/produtos";
	
	public Cliente buscarClientePorId(Long clienteID) {
		RestTemplate rest = new RestTemplate();
		Map<String, Long> params = new HashMap<>();
		params.put("id", clienteID);
		return rest.getForObject(srvPessoas + "/{id}?projection=cliente", Cliente.class, params);
	}
	
	public ProdutoVendas buscarProdutoPorId(Long produtoID) {
		RestTemplate rest = new RestTemplate();
		Map<String, Long> params = new HashMap<>();
		params.put("id", produtoID);
		return rest.getForObject(srvProdutos + "/{id}?projection=produtoVendas", ProdutoVendas.class, params);
	}

}
