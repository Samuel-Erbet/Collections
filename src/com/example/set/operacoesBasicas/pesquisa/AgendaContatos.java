package com.example.set.operacoesBasicas.pesquisa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> agendaContatos;

    public AgendaContatos(){
        this.agendaContatos = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        agendaContatos.add(new Contato(nome, numero));
    }

    public void removerContato(int numero) {
        Contato numeroRemover = null;

        for (Contato c : agendaContatos) {
            if (c.getNumero() == numero) {
                numeroRemover = c;
                break;
            }
        }
        agendaContatos.remove(numeroRemover);

    }

    public void exibirAgenda(){
        System.out.println(agendaContatos);
    }

    public HashSet pesquisarContato(String nome){
        HashSet<Contato> contatoPesquisa = new HashSet<>();
        for (Contato c : agendaContatos){
            if (c.getNome() == nome){
                contatoPesquisa.add(c);
            }
        }

        return contatoPesquisa;
    }

    public void atualizarNumero(String nome, int novoNumero){
        for (Contato c : agendaContatos){
            if (c.getNome() == nome){
                c.setNumero(novoNumero);
            }
        }
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("samuel",92790313);
        agenda.adicionarContato("claudio",89127865);
        agenda.adicionarContato("maria",12302973);
        agenda.adicionarContato("fernanda",94311073);
        agenda.adicionarContato("fernanda",94311073);
        agenda.adicionarContato("alonso",30912373);
        agenda.adicionarContato("cleber",13413386);
        agenda.adicionarContato("rodolfo",34215454);
        agenda.adicionarContato("vania",11215341);

        agenda.exibirAgenda();

        agenda.atualizarNumero("samuel", 14169999);
        agenda.exibirAgenda();

        agenda.removerContato(89127865);
        agenda.exibirAgenda();

        agenda.exibirAgenda();

        System.out.println(agenda.pesquisarContato("fernanda"));


    }
}
