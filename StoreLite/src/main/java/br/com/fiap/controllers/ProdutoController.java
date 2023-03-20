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

import br.com.fiap.models.Produto;

@RestController
public class ProdutoController {

    Logger log = LoggerFactory.getLogger(ProdutoController.class);

    List<Produto> produtos = new ArrayList<>();

    @GetMapping("/api/produto")
    public List<Produto> index(){
       return produtos;
    
    }
    
    @PostMapping("/api/produto")
    public Produto create(@RequestBody Produto produto) {
        log.info("Cadastrando produto" + produto);
        produto.setId(produtos.size() + 1l);
        produtos.add(produto);
        return null;
    }


    @GetMapping("/api/produto/{id}")
    public ResponseEntity<Produto> show(@PathVariable Long id) {
        log.info("Detalhando produto" + id);
        var produtoEncontrado = produtos.stream().filter(d -> d.getId().equals(id)).findFirst();

        if (produtoEncontrado.isEmpty())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        return ResponseEntity.ok(produtoEncontrado.get());
    }

    @DeleteMapping("/api/produto/{id}")
    public ResponseEntity<Produto> destroy(@PathVariable Long id) {
        log.info("Apagando produto" + id);
        var produtoEncontrado = produtos.stream().filter(d -> d.getId().equals(id)).findFirst();

        if (produtoEncontrado.isEmpty())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        produtos.remove(produtoEncontrado.get());

        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @PutMapping("/api/produto/{id}")
    public ResponseEntity<Produto> update(@PathVariable Long id, @RequestBody Produto produto) {
        log.info("Atualizando produto" + id);
        var produtoEncontrado = produtos.stream().filter(d -> d.getId().equals(id)).findFirst();

        if (produtoEncontrado.isEmpty())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        produtos.remove(produtoEncontrado.get());
        produto.setId(id);
        produtos.add(produto);

        return ResponseEntity.ok(produto);
        
    }

   
}
