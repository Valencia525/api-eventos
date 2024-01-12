package com.ipn.mx.Evento.Servicios;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import jakarta.websocket.DecodeException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ipn.mx.Evento.Entidades.Asistente;
import com.ipn.mx.Evento.Entidades.Evento;

import java.util.List;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

@Service
public class InformePdfService {

    @Autowired
    private EventoService eventoService;

    @Autowired
    private AsistenteService asistenteService;

    public byte[] generarInformeEventos() throws DecodeException, IOException, DocumentException {
        List<Evento> eventos = eventoService.obtenerTodosLosEventos();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        try {
            Document document = new Document();
            PdfWriter.getInstance(document, baos);
            document.open();

            for (Evento evento : eventos) {
                // Agrega los datos del evento al PDF
                document.add(new Paragraph("ID: " + evento.getIdEvento()));
                document.add(new Paragraph("Nombre: " + evento.getNombreEvento()));
                document.add(new Paragraph("Descripción: " + evento.getDescripcionEvento()));
                document.add(new Paragraph("Fecha: " + evento.getFechaEvento()));
                document.add(new Paragraph("-----"));
            }

            document.close();
        } catch (Exception e) {
            throw new DocumentException("Error al generar el informe PDF de eventos", e);
        }

        return baos.toByteArray();
    }

    public byte[] generarInformeAsistentes() throws DocumentException, IOException {
        List<Asistente> asistentes = asistenteService.obtenerTodosLosAsistentes();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        try {
            Document document = new Document();
            PdfWriter.getInstance(document, baos);
            document.open();

            for (Asistente asistente : asistentes) {
                // Agrega los datos del asistente al PDF
                document.add(new Paragraph("ID: " + asistente.getIdAsistente()));
                document.add(new Paragraph("Nombre: " + asistente.getNombreAsistente()));
                document.add(new Paragraph("Apellido: " + asistente.getApellidoAsistente()));
                document.add(new Paragraph("Correo: " + asistente.getCorreoAsistente()));
                document.add(new Paragraph("Teléfono: " + asistente.getTelefonoAsistente()));
                document.add(new Paragraph("ID del Evento: " + asistente.getIdEvento()));
                document.add(new Paragraph("-----"));
            }

            document.close();
        } catch (Exception e) {
            throw new DocumentException("Error al generar el informe PDF de asistentes", e);
        }

        return baos.toByteArray();
    }
}
