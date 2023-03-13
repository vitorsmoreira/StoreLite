package br.com.fiap.controllers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.models.Mercado;

@RestController
public class MercadoController {

    private LocalDateTime data_inicio;
    private LocalDateTime data_termino;

    @GetMapping("/api/mercado")
    public Mercado show() {
        String horario;
        horario = "09:00";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        data_inicio = LocalDateTime.parse(horario, formatter);

        horario = "19:00";
        data_termino = LocalDateTime.parse(horario, formatter);
        return new Mercado(
                "Mercadinho Damaceno",
                "(11) 98765-4321",
                data_inicio,
                data_termino,
                "33.254.819/0001-34",
                10.0);
    }
}
