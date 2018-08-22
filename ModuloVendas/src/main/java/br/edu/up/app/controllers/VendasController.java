package br.edu.up.app.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.client.RestTemplate;

import br.edu.up.app.dominio.Cliente;
import br.edu.up.app.dominio.ProdutoVendas;
import br.edu.up.app.repository.ClienteRepository;
import br.edu.up.app.repository.ProdutoRepository;

@RepositoryRestController
public class VendasController {
	
	@Autowired
	public ClienteRepository cRepository;
	
	@Autowired
	public ProdutoRepository pRepository;
	
	
	private final String srvPessoas = "http://localhost:8080/pessoas";
	private final String srvProdutos = "http://localhost:8081/produtos";
	
	public Cliente buscarClientePorId(Long idCliente) {
		RestTemplate rest = new RestTemplate();
		Map<String, Long> params = new HashMap<>();
		params.put("id", idCliente);
		return rest.getForObject(srvPessoas + "/{id}?projection=cliente", Cliente.class, params);
	}
	
	public ProdutoVendas buscarProdutoPorId(Long idProduto) {
		RestTemplate rest = new RestTemplate();
		Map<String, Long> params = new HashMap<>();
		params.put("id", idProduto);
		return rest.getForObject(srvProdutos + "/{id}?projection=produtoVendas", ProdutoVendas.class, params);
	}
}
