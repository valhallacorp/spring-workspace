package com.up.vendas.ModuloVendas;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.up.vendas.ModuloVendas.controllers.VendasController;
import com.up.vendas.ModuloVendas.dominio.Cliente;
import com.up.vendas.ModuloVendas.dominio.ProdutoVendas;
import com.up.vendas.ModuloVendas.services.VendasService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ModuloVendasApplicationTests {
	@Autowired
	VendasService vs;
	@Autowired
	VendasController vc;
	
	public void testarInclusaoVendas() {
		Cliente cliente = vc.buscarClientePorId(3L);
		ProdutoVendas produto = vc.buscarProdutoPorId(1L);
		vs.salvarVenda(cliente, produto);
		
	}

}
