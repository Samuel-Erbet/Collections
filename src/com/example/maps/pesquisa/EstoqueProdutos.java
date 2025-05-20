package com.example.maps.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Integer,  Produto> produtos;

    public EstoqueProdutos() {
        this.produtos = new HashMap<>();
    }
    public void adicionarProduto(String nome, int quantidade, double preco, int codigo){
        produtos.put(codigo,new Produto(nome,quantidade,preco,codigo));
    }
    public void exibirProdutos(){
        System.out.println(produtos);
    }
    public void calcularEstoque(){
        int total =0;
        int count = 0;
        if (produtos.containsKey(produtos.get(count).getQuantidade())){
            total+=produtos.get(count).getQuantidade();
            count+=1;
        }
        System.out.println("o total de estoque foi : "+total);
    }
}
