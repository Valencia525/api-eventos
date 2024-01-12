package com.ipn.mx.Evento.Servicios;

import com.ipn.mx.Evento.Entidades.Asistente;
import com.ipn.mx.Evento.Repositorio.AsistenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AsistenteServiceImpl implements AsistenteService {

    @Autowired
    private AsistenteRepository asistenteRepository;

    @Override
    public List<Asistente> getAllAsistentes() {
        return asistenteRepository.findAll();
    }

    @Override
    public Optional<Asistente> getAsistenteById(Long id) {
        return asistenteRepository.findById(id);
    }

    @Override
    public Asistente saveAsistente(Asistente asistente) {
        return asistenteRepository.save(asistente);
    }

    @Override
    public void deleteAsistente(Long id) {
        asistenteRepository.deleteById(id);
    }

    @Override
    public List<Asistente> obtenerTodosLosAsistentes() {
        return asistenteRepository.findAll();
    }
}
