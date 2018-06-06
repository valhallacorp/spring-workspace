package com.eventosapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.eventoapp.model.Evento;

public interface EventoRepository extends CrudRepository<Evento, String> {
	Evento findByCodigo(long codigo);

}
