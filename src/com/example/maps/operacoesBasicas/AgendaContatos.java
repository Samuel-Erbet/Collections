package com.example.maps.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaMap;

    public AgendaContatos( ) {
        this.agendaMap = new HashMap<>();
    }

    public Map<String, Integer> getAgendaMap() {
        return agendaMap;
    }

    public void setAgendaMap(Map<String, Integer> agendaMap) {
        this.agendaMap = agendaMap;
    }

    public void adicionarContato(String nome, Integer numero){
        agendaMap.put(nome, numero);
    }

    public void removerContato(String nome){
        if (agendaMap.containsKey(nome)){
            agendaMap.remove(nome);
            System.out.println("removido");
        } else{
            System.out.println("não foi encontrado");
        }
    }

    public void mostrarAgenda(){
        System.out.println(agendaMap);
    }

    public void pesquisarPorNome(String obj){
        String contato = null;
        if (agendaMap.containsKey(obj)){
            contato = String.valueOf(agendaMap.get(obj));
            System.out.println(contato);

        } else {
            System.out.println("não foi encontrado");
        }
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();
        agenda.adicionarContato("caldui",134);
        agenda.adicionarContato("marcela", 201);
        agenda.adicionarContato("joaopedro", 345);
        agenda.adicionarContato("aline", 789);
        agenda.adicionarContato("gustavo", 123);
        agenda.adicionarContato("vanessa", 456);
        agenda.adicionarContato("lucas", 987);
        agenda.adicionarContato("camila", 654);
        agenda.adicionarContato("rodrigo", 321);
        agenda.adicionarContato("bruna", 777);
        agenda.adicionarContato("felipe", 888);

        agenda.mostrarAgenda();

        agenda.removerContato("felipe");
        agenda.removerContato("claudoi");

        agenda.mostrarAgenda();

        agenda.pesquisarPorNome("bruna");

    }
}
