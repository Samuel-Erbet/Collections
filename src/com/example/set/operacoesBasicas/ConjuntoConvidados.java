package com.example.set.operacoesBasicas;

import java.util.*;

public class ConjuntoConvidados {

    private Set<Convidado> listaConvidados;

    public ConjuntoConvidados(){

        this.listaConvidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigo ){

        listaConvidados.add(new Convidado(nome, codigo));
    }

    public void removerConvidado(int codigo){
        Convidado convidadoRemover = null;

        for (Convidado c : listaConvidados){
            if (c.getCodigoConvite() == codigo){
                convidadoRemover = c;
                break;
            }

        }
        listaConvidados.remove(convidadoRemover);


        System.out.println("removido");
    }

    public int contarConvidados(){
        int n = 0;
        for (Convidado c : listaConvidados){
            n+=1;
        }
        return n;
    }

    public void listaConvidados(){
        System.out.println(listaConvidados);
    }

    public static void main(String[] args) {
        ConjuntoConvidados listaConvidados = new ConjuntoConvidados();
        System.out.println(listaConvidados.contarConvidados());

        listaConvidados.adicionarConvidado("carlos",12345);
        listaConvidados.adicionarConvidado("claudia",12346);
        listaConvidados.adicionarConvidado("creusa",12346);
        listaConvidados.adicionarConvidado("rogerio",12348);
        listaConvidados.adicionarConvidado("sidney",12349);
        listaConvidados.adicionarConvidado("caio",12350);
        listaConvidados.adicionarConvidado("samuel",12351);


        System.out.println("o numero de convidados é: "+listaConvidados.contarConvidados());
        listaConvidados.removerConvidado(1);
        listaConvidados.listaConvidados();

    }
}
