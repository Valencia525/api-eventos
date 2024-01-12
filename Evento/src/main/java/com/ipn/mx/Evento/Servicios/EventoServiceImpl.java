package com.ipn.mx.Evento.Servicios;

import com.ipn.mx.Evento.Entidades.Evento;
import com.ipn.mx.Evento.Repositorio.EventoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventoServiceImpl implements EventoService {

    @Autowired
    private EventoRepository eventoRepositorio;

    @Override
    public List<Evento> getAllEventos() {
        return eventoRepositorio.findAll();
    }

    @Override
    public Optional<Evento> getEventoById(Long id) {
        return eventoRepositorio.findById(id);
    }

    @Override
    public Evento saveEvento(Evento evento) {
        return eventoRepositorio.save(evento);
    }

    @Override
    public void deleteEvento(Long id) {
        eventoRepositorio.deleteById(id);
    }

    @Override
    public List<Evento> obtenerTodosLosEventos() {
        return eventoRepositorio.findAll();
    }
}
