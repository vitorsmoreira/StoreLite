package br.com.fiap.controllers;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.models.Produto;

@RestController
public class ProdutoController {

    @GetMapping("/api/produto")
    public Produto show() {
        return new Produto(
            "Ámido de Milho", 
            "Maizena", 
            500.0, 
            0, 
            10.5, 
            0, 
            1, 
            LocalDateTime.now()
        );
    }
}
