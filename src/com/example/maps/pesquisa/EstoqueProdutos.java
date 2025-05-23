package com.example.maps.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Integer,  Produto> produtos;

    public EstoqueProdutos() {
        this.produtos = new HashMap<>();
    }
    public void adicionarProduto(String nome, int quantidade, double preco, int codigo ){
        produtos.put( codigo,new Produto(nome,quantidade,preco ));
    }
    public void exibirProdutos(){
        System.out.println(produtos);
    }
    public void calcularEstoque(){
        int total = 0;
        int count = 0;
        if (!produtos.isEmpty()){
            for (Produto p : produtos.values()){
                total+= p.getQuantidade();
            }
        }
        System.out.println("o total de estoque foi : "+total);
    }

    public double maisCaro(){
        double valor =0;

        if (!produtos.isEmpty()) {
            for (Produto p : produtos.values()){
                if (valor<p.getPreco()){
                    valor = p.getPreco();
                }
            }
        }
            return valor;
        }

        public double menorPreco() {
            double valor = 9999999;

            if (!produtos.isEmpty()) {
                for (Produto p : produtos.values()) {
                    if (valor > p.getPreco()) {
                        valor = p.getPreco();
                    }
                }
            }
            return valor;
        }

    public String maiorQuantidade(){
            int valor =0;
            String produto = null;
            double total = 0;
            if (!produtos.isEmpty()) {
                for (Produto p : produtos.values()){
                    if (valor<p.getQuantidade()){
                        valor = p.getQuantidade();
                        produto = p.getNome();
                        total = p.getQuantidade() * p.getPreco();
                    }
                }
            }
        return "o produto com maior quantidade é : "+produto+" com "+valor+" no estoque"+" custando o lote "+total;
    }


    public static void main(String[] args) {
        EstoqueProdutos produtos = new EstoqueProdutos();
        produtos.adicionarProduto("creme",134,15.75,1);
        produtos.adicionarProduto("leite",10000,9.5,2);
        produtos.adicionarProduto("biscoito",10,5.75,3);
        produtos.adicionarProduto("creme premium",11,150.75,4);

        produtos.exibirProdutos();

        produtos.calcularEstoque();
        System.out.println("o produto mais caro custa: "+produtos.maisCaro());
        System.out.println("o produto mais barato custa: "+produtos.menorPreco());
        System.out.println(produtos.maiorQuantidade());
    }
}
