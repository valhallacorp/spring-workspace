package com.up.vendas.ModuloVendas.repository;

import org.springframework.data.repository.CrudRepository;

import com.up.vendas.ModuloVendas.dominio.ProdutoVendas;

public interface ProdutoRepository extends CrudRepository<ProdutoVendas, Long>{

}
