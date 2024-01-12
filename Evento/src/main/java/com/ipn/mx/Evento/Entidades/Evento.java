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
@Table(name="Evento", schema = "public")
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEvento;
    @Column(name = "nombreEvento" , length = 100 , nullable = false)
    private String nombreEvento;
    @Column(name = "descripcionEvento", length = 100, nullable = false)
    private String descripcionEvento;
    @Column(name = "FechaEvento", length = 50, nullable = true)
    private String FechaEvento ;
}
