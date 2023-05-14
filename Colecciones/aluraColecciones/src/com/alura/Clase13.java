package com.alura;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Clase13 {
    public static void main(String[] args) {
        String variable1 = "Roger Federer";
        String variable2 = "Roger Waters";
        String variable3 = "Roger Rabbit";
        String variable4 = "Roger Moore";
        String variable5 = "Roger Taylor";
        String variable6 = "Roger Daltrey";
        String variable7 = "Roger Daltrey";
        String variable8 = "Roger Taylor";

        Set<String> listaNombres = new HashSet<>();

        listaNombres.add(variable1);
        listaNombres.add(variable2);
        listaNombres.add(variable3);
        listaNombres.add(variable4);
        listaNombres.add(variable5);
        listaNombres.add(variable6);

        boolean valida = listaNombres.add("Roger Yoda");

        String max = listaNombres.stream().max(Comparator.comparingInt(String::length)).get();
        System.out.println(max);

        listaNombres.removeIf(nombre -> "Roger Rabbit".equalsIgnoreCase(nombre));

        listaNombres.forEach(nombre -> {
            System.out.println(nombre);
        });
    }
}
