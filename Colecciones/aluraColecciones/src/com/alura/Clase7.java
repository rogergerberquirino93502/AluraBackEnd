package com.alura;

import com.alura.model.Alura;
import com.alura.model.Curso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Clase7 {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Java", 30);
        curso1.addClase(new Alura("ArrayList"));
        curso1.addClase(new Alura("List"));
        curso1.addClase(new Alura("LinkedList"));
        curso1.addClase(new Alura("Inmutable"));

        List<Alura> aulaList = curso1.getRequisitos();


        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);

        System.out.println(aulaList);
    }
}
