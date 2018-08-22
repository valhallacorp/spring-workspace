package br.edu.up.app.repository;

import org.springframework.data.repository.CrudRepository;

import br.edu.up.app.dominio.ProdutoVendas;

public interface ProdutoRepository extends CrudRepository<ProdutoVendas, Long> {


}
