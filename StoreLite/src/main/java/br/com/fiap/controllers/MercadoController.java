package br.com.fiap.controllers;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.models.Mercado;

@RestController
public class MercadoController {

    Logger log = LoggerFactory.getLogger(MercadoController.class);

    List<Mercado> mercados = new ArrayList<>();

    @GetMapping("api/mercado")
    public List<Mercado> index(){
       return mercados;
    
    }
    
    @PostMapping("api/mercado")
    public Mercado create(@RequestBody Mercado mercado) {
        log.info("Cadastrando mercado" + mercado);
        mercado.setId(mercados.size() + 1l);
        mercados.add(mercado);
        return null;
    }


    @GetMapping("api/mercado/{id}")
    public ResponseEntity<Mercado> show(@PathVariable Long id) {
        log.info("Detalhando mercado" + id);
        var mercadoEncontrado = mercados.stream().filter(d -> d.getId().equals(id)).findFirst();

        if (mercadoEncontrado.isEmpty())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        return ResponseEntity.ok(mercadoEncontrado.get());
    }

    @DeleteMapping("api/mercado/{id}")
    public ResponseEntity<Mercado> destroy(@PathVariable Long id) {
        log.info("Apagando mercado" + id);
        var mercadoEncontrado = mercados.stream().filter(d -> d.getId().equals(id)).findFirst();

        if (mercadoEncontrado.isEmpty())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        mercados.remove(mercadoEncontrado.get());

        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @PutMapping("api/mercado/{id}")
    public ResponseEntity<Mercado> update(@PathVariable Long id, @RequestBody Mercado mercado) {
        log.info("Atualizando mercado" + id);
        var mercadoEncontrado = mercados.stream().filter(d -> d.getId().equals(id)).findFirst();

        if (mercadoEncontrado.isEmpty())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        mercados.remove(mercadoEncontrado.get());
        mercado.setId(id);
        mercados.add(mercado);

        return ResponseEntity.ok(mercado);
        
    }
}
