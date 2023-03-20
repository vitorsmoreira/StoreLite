package br.com.fiap.models;

import java.time.LocalDateTime;

public class Mercado {
    private Long id;
    private String nome;
    private String telefone;
    private LocalDateTime expediente_inicio;
    private LocalDateTime expediente_termino;
    private String cnpj;
    private double preco_minimo;


    public Mercado(Long id, String nome, String telefone, LocalDateTime expediente_inicio, LocalDateTime expediente_termino, String cnpj,
            double preco_minimo) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.expediente_inicio = expediente_inicio;
        this.expediente_termino = expediente_termino;
        this.cnpj = cnpj;
        this.preco_minimo = preco_minimo;
    }

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDateTime getExpediente_inicio() {
        return expediente_inicio;
    }

    public void setExpediente_inicio(LocalDateTime expediente_inicio) {
        this.expediente_inicio = expediente_inicio;
    }

    public LocalDateTime getExpediente_termino() {
        return expediente_termino;
    }

    public void setExpediente_termino(LocalDateTime expediente_termino) {
        this.expediente_termino = expediente_termino;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public double getPreco_minimo() {
        return preco_minimo;
    }

    public void setPreco_minimo(double preco_minimo) {
        this.preco_minimo = preco_minimo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
