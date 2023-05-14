package com.alura;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Clase11 {
    public static void main(String[] args) {
        String variable1 = "Roger Federer";
        String variable2 = "Roger Waters";
        String variable3 = "Roger Rabbit";
        String variable4 = "Roger Moore";
        String variable5 = "Roger Taylor";
        String variable6 = "Roger Daltrey";

        Set<String> listaNombres = new HashSet<>();

        listaNombres.add(variable1);
        listaNombres.add(variable2);
        listaNombres.add(variable3);
        listaNombres.add(variable4);
        listaNombres.add(variable5);
        listaNombres.add(variable6);

        for (String nombre : listaNombres) {
            System.out.println(nombre);
        }
    }
}
