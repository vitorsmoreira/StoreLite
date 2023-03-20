package br.com.fiap.models;

import java.time.LocalDateTime;

public class Produto {
    private Long id;
    private String nome;
    private String fabricante;
    private double peso;
    private double volume;
    private double preco;
    private double frete;
    private int quantidade;
    private LocalDateTime vencimento;

    public Produto(Long id, String nome, String fabricante, double peso, double volume, double preco, double frete,
            int quantidade, LocalDateTime vencimento) {
        this.id = id;
        this.nome = nome;
        this.fabricante = fabricante;
        this.peso = peso;
        this.volume = volume;
        this.preco = preco;
        this.frete = frete;
        this.quantidade = quantidade;
        this.vencimento = vencimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public LocalDateTime getVencimento() {
        return vencimento;
    }

    public void setVencimento(LocalDateTime vencimento) {
        this.vencimento = vencimento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
