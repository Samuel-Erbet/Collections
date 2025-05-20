package com.example.maps.pesquisa;

public class Produto {
    private String nome;
    private int quantidade;
    private double preco;
    private long codigo;

    public Produto(String nome, int quantidade, double preco, long codigo) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }
}
