package com.ipn.mx.Evento.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ipn.mx.Evento.Entidades.Asistente;

public interface AsistenteRepository extends JpaRepository<Asistente, Long> {
    // Puedes agregar métodos personalizados según tus necesidades.
}
