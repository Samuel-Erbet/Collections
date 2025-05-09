package com.example.generics;

import java.util.ArrayList;
import java.util.List;

public class ExemplosGenerics {
    public static void main(String[] args) {
        //SEM GENERICS
        List listaSemGenerics = new ArrayList();
        listaSemGenerics.add("elemento 1");
        listaSemGenerics.add(10);

        //COM GENERICS
        List<String> listaComGenerics = new ArrayList<>();
        listaComGenerics.add("elemento 1");
        listaComGenerics.add("elemento 2");

        for (Object elem : listaComGenerics) {
            System.out.println(elem);
        }

        for (Object elem : listaSemGenerics) {
            String str = (String) elem;
            System.out.println(str);
        }
    }
}
