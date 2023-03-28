package br.com.fiap.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    
}