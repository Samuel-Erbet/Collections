package com.example.list.operacoes_basicas.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> listaPessoas;

    public OrdenacaoPessoas( ){

        this.listaPessoas = new ArrayList<>();
    }

    public void adicionarPessoas(String nome,int idade, double altura){
        listaPessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pesssoasPorIdade = new ArrayList<>(listaPessoas);
        Collections.sort(pesssoasPorIdade);
        return pesssoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(listaPessoas);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public void mostrarPessoas(){
        for (Pessoa p : listaPessoas) {
            System.out.println(p);
        }
    }
    public static void main(String[] args) {
        OrdenacaoPessoas pessoas = new OrdenacaoPessoas();

        pessoas.adicionarPessoas( "carla", 13, 1.42);
        pessoas.adicionarPessoas( "carlos", 14, 1.92);
        pessoas.adicionarPessoas( "aldebaran", 73, 2.42);
        pessoas.adicionarPessoas( "andreia", 30, 1.20);
        pessoas.adicionarPessoas( "cida", 133, 1.60);
        pessoas.adicionarPessoas( "andrade", 18, 1.82);
        pessoas.adicionarPessoas( "marcos", 44, 1.72);
        pessoas.adicionarPessoas( "cleiton", 8, 1.40);
        pessoas.adicionarPessoas( "cirleia", 42, 1.30);

        System.out.println(pessoas.ordenarPorAltura());
        System.out.println(pessoas.ordenarPorIdade());
        pessoas.mostrarPessoas();

    }


}
