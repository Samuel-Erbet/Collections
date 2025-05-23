package com.example.maps.ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Eventos> agenda;

    public AgendaEventos() {
        this.agenda = new HashMap<>();
    }

    public void adiconarEvento(String nome, String atracao, LocalDate data){
        agenda.put(data,new Eventos(nome,atracao));
    }

    public void exibirAgenda(){
        Map<LocalDate, Eventos> agendaOrdenada = new TreeMap<>();
        agendaOrdenada.putAll(agenda);
        System.out.println(agendaOrdenada);
    }

    public void exibirProximoEvento(){
        Map<LocalDate, Eventos> agendaOrdenada = new TreeMap<>(agenda);
        LocalDate dataAtual = LocalDate.now();

        for (Map.Entry<LocalDate, Eventos> entry : agendaOrdenada.entrySet()){
           if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){

               System.out.println("o evento "+entry.getValue().getNomeEvento()+" ocorrera no dia "+entry.getKey());
                break;
           }
            System.out.println(entry);
        }
    }

    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();


        agenda.adiconarEvento("Maratona de Programação", "Final Nacional", LocalDate.of(2025, 7, 5));
        agenda.adiconarEvento("Festival de Cinema", "Premiação", LocalDate.of(2025, 11, 12));
        agenda.adiconarEvento("Beto Carreiro", "Touro Bravo", LocalDate.of(2024, 4, 13));
        agenda.adiconarEvento("Rock in Rio", "Show Principal", LocalDate.of(2025, 9, 20));
        agenda.adiconarEvento("Feira de Tecnologia", "Palestra IA", LocalDate.of(2025, 3, 15));
        agenda.exibirAgenda();
        agenda.exibirProximoEvento();


    }
}
