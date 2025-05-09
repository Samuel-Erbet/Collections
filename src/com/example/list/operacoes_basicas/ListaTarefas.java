package com.example.list.operacoes_basicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private List<Tarefa> tarefaList;

    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String tarefa){
        tarefaList.add(new Tarefa(tarefa));
    }

    public void removerTarefa(String descricao){
        ArrayList<Tarefa> removerTarefa = new ArrayList<>();

        for(Tarefa elem: tarefaList){

            if(elem.getDescricao().equalsIgnoreCase(descricao)){
                removerTarefa.add(elem);
            }
        }
        tarefaList.removeAll(removerTarefa);
    }

    public int totalTarefas(){
        return tarefaList.size();
    }

    public void descricaoTarefa(){
        System.out.println(tarefaList);
    }


    public static void main(String[] args) {

        ListaTarefas lista_tarefas = new ListaTarefas();

        lista_tarefas.adicionarTarefa("ir na academia");
        lista_tarefas.adicionarTarefa("estudar");
        lista_tarefas.adicionarTarefa("jantar");
        lista_tarefas.adicionarTarefa("estudar");
        lista_tarefas.adicionarTarefa("estudar");
        lista_tarefas.adicionarTarefa("estudar");
        lista_tarefas.adicionarTarefa("estudar");

        lista_tarefas.descricaoTarefa();
        System.out.println("o numero total de tarefas é: "+lista_tarefas.totalTarefas());

        lista_tarefas.removerTarefa("estudar");
        System.out.println("o numero total de tarefas é: "+lista_tarefas.totalTarefas());


    }
}
