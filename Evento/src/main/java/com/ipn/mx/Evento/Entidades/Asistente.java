package com.ipn.mx.Evento.Entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="Asistente", schema = "public")
public class Asistente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAsistente;

    @Column(name = "nombreAsistente", length = 100, nullable = false)
    private String nombreAsistente;

    @Column(name = "apellidoAsistente", length = 100, nullable = false)
    private String apellidoAsistente;

    @Column(name = "correoAsistente", length = 100, nullable = false)
    private String correoAsistente;

    @Column(name = "telefonoAsistente", length = 20, nullable = false)
    private String telefonoAsistente;

    @Column(name = "idEvento", nullable = false)
    private Long idEvento;
}
