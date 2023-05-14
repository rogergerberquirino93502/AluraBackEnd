package com.alura;

import java.util.ArrayList;

public class Clase2 {
    public static void main(String[] args) {
        String variable1 = "Metodo 1";
        String variable2 = "Metodo 2";
        String variable3 = "Metodo 3";
        String variable4 = "Metodo 4";

        ArrayList<String> lista = new ArrayList<>();
        lista.add(variable1);
        lista.add(variable2);
        lista.add(variable3);
        lista.add(variable4);

        System.out.println("Lista de variables: " + lista);

        /*for (int i = 0; i < lista.size(); i++) {
            System.out.println("Elemento " + i + ": " + lista.get(i));
        }*/
        lista.forEach((elemento) -> {
            System.out.println("Elemento: " + elemento);
        });
    }
}
