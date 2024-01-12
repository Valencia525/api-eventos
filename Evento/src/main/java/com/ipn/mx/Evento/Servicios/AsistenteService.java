package com.ipn.mx.Evento.Servicios;

import com.ipn.mx.Evento.Entidades.Asistente;

import java.util.List;
import java.util.Optional;

public interface AsistenteService {
    List<Asistente> getAllAsistentes();

    Optional<Asistente> getAsistenteById(Long id);

    Asistente saveAsistente(Asistente asistente);

    void deleteAsistente(Long id);

    List<Asistente> obtenerTodosLosAsistentes();
}
