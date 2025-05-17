package com.example.set.operacoesBasicas.ordenação;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> listaProdutos;

    public CadastroProdutos(){
        this.listaProdutos = new HashSet<>();
    }

    public void adicionarProduto(String nome, int cdg, double prc, int qtd){
        listaProdutos.add(new Produto(nome,cdg,prc,qtd));
    }

    public Set<Produto> exibirPorNome(){
        Set<Produto> listaNome = new TreeSet<>(listaProdutos);
        return  listaNome;
    }

    public Set<Produto> exibirPorpreco(){
        Set<Produto> listaPreco = new TreeSet<>(new ComparatorPorpreco());
        listaPreco.addAll(listaProdutos);
        return listaPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos produtos = new CadastroProdutos();

        produtos.adicionarProduto("batata", 0,0.50,1);
        produtos.adicionarProduto("arroz", 1, 5.99, 10);
        produtos.adicionarProduto("feijão", 2, 6.49, 8);
        produtos.adicionarProduto("macarrão", 3, 3.29, 15);
        produtos.adicionarProduto("óleo de soja", 4, 7.89, 5);
        produtos.adicionarProduto("açúcar", 5, 4.75, 12);
        produtos.adicionarProduto("sal", 6, 2.19, 20);
        produtos.adicionarProduto("leite", 7, 4.59, 10);
        produtos.adicionarProduto("café", 8, 9.99, 6);
        produtos.adicionarProduto("biscoito", 9, 2.99, 18);
        produtos.adicionarProduto("detergente", 10, 1.79, 25);


        System.out.println(produtos.exibirPorNome());

        System.out.println(produtos.exibirPorpreco());


    }
}

