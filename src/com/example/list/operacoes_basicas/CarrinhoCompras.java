package com.example.list.operacoes_basicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    private List<Item> listaItens;

    public CarrinhoCompras(){
        this.listaItens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        listaItens.add(new Item(nome,preco,quantidade));
    }

    public void removerItem(String nome){
        List<Item> listaRemover = new ArrayList<>();

        for(Item elem : listaItens){
            if (elem.getNome().equalsIgnoreCase(nome)) {
                listaRemover.add(elem);
            }
        }

        listaItens.removeAll(listaRemover);
    }

    public void exibirItens(){
        System.out.println(listaItens);
    }

    public double valorTotal(){
        double total = 0;
        for (Item elem : listaItens){
            total+=elem.getPreco() * elem.getQuantidade();
        }
        return total;
    }


    public static void main(String[] args) {
        CarrinhoCompras carrinho = new CarrinhoCompras();

        carrinho.adicionarItem("pão de forma",15.53,2);
        carrinho.adicionarItem("pão de forma",15.53,2);
        carrinho.adicionarItem("leite",5.00,8);
        carrinho.adicionarItem("amendoim",7.00,5);


        carrinho.exibirItens();
        carrinho.removerItem("pão de forma");
        carrinho.exibirItens();
        System.out.println("o total dos produtos é: "+carrinho.valorTotal());
    }
}
