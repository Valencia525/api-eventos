package com.ipn.mx.Evento.Servicios;

import com.ipn.mx.Evento.Entidades.Evento;

import java.util.List;
import java.util.Optional;

public interface EventoService {

    List<Evento> getAllEventos();

    Optional<Evento> getEventoById(Long id);

    Evento saveEvento(Evento evento);

    void deleteEvento(Long id);

    List<Evento> obtenerTodosLosEventos();
}
