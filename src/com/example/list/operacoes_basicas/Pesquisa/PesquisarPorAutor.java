package com.example.list.operacoes_basicas.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class PesquisarPorAutor {

    private List<Livro> listaLivros;

    public PesquisarPorAutor(){
        this.listaLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        listaLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public void pesquisarPorAutor(String autor){
        List<Livro> livroAutor = new ArrayList<>();

        if (!listaLivros.isEmpty()){
            for (Livro elem : listaLivros){
                if (elem.getAutor().equalsIgnoreCase(autor)){
                    livroAutor.add(elem);
                }
            }
        }

        System.out.println(livroAutor);
    }

    public void pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livroIntervalo = new ArrayList<>();

        if (!listaLivros.isEmpty()){
            for (Livro elem : listaLivros){
                if (elem.getAnoPublicacao()<anoFinal && elem.getAnoPublicacao()>anoInicial){
                    livroIntervalo.add(elem);
                }
            }
        }

        System.out.println(livroIntervalo);
    }

    public void pesquisarPorTitulo(String titulo){
        for (Livro elem : listaLivros){
            if (elem.getTitulo().equalsIgnoreCase(titulo)){
                System.out.println(elem);
                break;
            }
        }
    }

    public static void main(String[] args) {
        PesquisarPorAutor listaLivros = new PesquisarPorAutor();
        listaLivros.adicionarLivro("harry potter","jk rolling",1998);
        listaLivros.adicionarLivro("harry potter","jk rolling",1998);
        listaLivros.adicionarLivro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        listaLivros.adicionarLivro("Dom Quixote", "Miguel de Cervantes", 1605);
        listaLivros.adicionarLivro("1984", "George Orwell", 1949);
        listaLivros.adicionarLivro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943);
        listaLivros.adicionarLivro("Cem Anos de Solidão", "Gabriel García Márquez", 1967);
        listaLivros.adicionarLivro("Orgulho e Preconceito", "Jane Austen", 1813);
        listaLivros.adicionarLivro("A Revolução dos Bichos", "George Orwell", 1945);
        listaLivros.adicionarLivro("O Hobbit", "J.R.R. Tolkien", 1937);
        listaLivros.adicionarLivro("A Menina que Roubava Livros", "Markus Zusak", 2005);
        listaLivros.adicionarLivro("O Código Da Vinci", "Dan Brown", 2003);
        listaLivros.adicionarLivro("It: A Coisa", "Stephen King", 1986);
        ;

        System.out.println("pesquisa por autor");
        System.out.println("==========================");
        listaLivros.pesquisarPorAutor("jk rolling");


        System.out.println("pesquisa por titulo");
        System.out.println("==========================");
        listaLivros.pesquisarPorTitulo("O Pequeno Príncipe");


        System.out.println("pesquisa por intervalo de anos");
        System.out.println("==========================");
        listaLivros.pesquisarPorIntervaloAnos(1937, 1960);
    }
}
