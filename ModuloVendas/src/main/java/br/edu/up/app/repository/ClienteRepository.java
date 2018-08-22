package br.edu.up.app.repository;

import org.springframework.data.repository.CrudRepository;

import br.edu.up.app.dominio.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {


}
