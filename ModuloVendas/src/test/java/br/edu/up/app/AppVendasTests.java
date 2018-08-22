package br.edu.up.app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.edu.up.app.controllers.VendasController;
import br.edu.up.app.dominio.Cliente;
import br.edu.up.app.dominio.ProdutoVendas;
import br.edu.up.app.services.VendasService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AppVendasTests {

	@Autowired
	VendasService sVendas;
	
	@Autowired
	VendasController cVendas;
	
	@Test
	public void testarInclusaoDeVenda() {
		
		Cliente cliente = cVendas.buscarClientePorId(3L);
		ProdutoVendas produto = cVendas.buscarProdutoPorId(1L);
		sVendas.salvarVenda(cliente, produto);
	}
}
