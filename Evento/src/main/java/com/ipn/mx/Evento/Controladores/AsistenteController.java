package com.ipn.mx.Evento.Controladores;

import com.ipn.mx.Evento.Entidades.Asistente;
import com.ipn.mx.Evento.Servicios.AsistenteService;
import com.ipn.mx.Evento.Servicios.InformePdfService;
import com.itextpdf.text.DocumentException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/asistentes")
public class AsistenteController {
    
    @Autowired
    private InformePdfService informePdfService;

    @Autowired
    private AsistenteService asistenteService;

    @GetMapping
    public List<Asistente> getAllAsistentes() {
        return asistenteService.getAllAsistentes();
    }

    @GetMapping("/{id}")
    public Optional<Asistente> getAsistenteById(@PathVariable Long id) {
        return asistenteService.getAsistenteById(id);
    }

    @PostMapping
    public Asistente saveAsistente(@RequestBody Asistente asistente) {
        return asistenteService.saveAsistente(asistente);
    }

    @PutMapping("/{id}")
    public Asistente updateAsistente(@PathVariable Long id, @RequestBody Asistente asistente) {
        asistente.setIdAsistente(id);
        return asistenteService.saveAsistente(asistente);
    }

    @DeleteMapping("/{id}")
    public void deleteAsistente(@PathVariable Long id) {
        asistenteService.deleteAsistente(id);
    }

    @GetMapping("/pdf")
    public ResponseEntity<byte[]> generarInformePdf() {
        try {
            byte[] informePdfBytes = informePdfService.generarInformeAsistentes();

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_PDF);
            headers.add("Content-Disposition", "inline; filename=informe_asistentes.pdf");

            return new ResponseEntity<>(informePdfBytes, headers, HttpStatus.OK);
        } catch (IOException | DocumentException e) {
            e.printStackTrace(); // Manejo adecuado de errores en producción
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
