package br.com.fiap.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.models.Mercado;

public interface MercadoRepository extends JpaRepository<Mercado, Long> {
    
}
