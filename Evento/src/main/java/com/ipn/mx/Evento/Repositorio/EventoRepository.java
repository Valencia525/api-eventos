package com.ipn.mx.Evento.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ipn.mx.Evento.Entidades.Evento;

public interface EventoRepository extends JpaRepository<Evento, Long> {

    
}
