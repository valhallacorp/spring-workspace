package br.edu.up.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.up.app.dominio.Cliente;
import br.edu.up.app.dominio.ProdutoVendas;
import br.edu.up.app.dominio.Venda;
import br.edu.up.app.repository.ClienteRepository;
import br.edu.up.app.repository.ProdutoRepository;
import br.edu.up.app.repository.VendaRepository;

@Service
public class VendasService {
	
	@Autowired
	public VendaRepository vRepository;	
	
	@Autowired
	public ClienteRepository cRepository;
	
	@Autowired
	public ProdutoRepository pRepository;
	
	public Iterable<Cliente> listarClientes(){
		return cRepository.findAll();
	}
	
	public Iterable<ProdutoVendas> listarProdutos(){
		return pRepository.findAll();
	}
	
	public Iterable<ProdutoVendas> listarProdutosVendidos(){
		return pRepository.findAll();
	}
	
    public void salvarVenda(Cliente cliente, ProdutoVendas produto) {
    	
    	cRepository.save(cliente);
    	pRepository.save(produto);
    	
		Venda venda = new Venda(cliente, produto);
        vRepository.save(venda);
	}
}
