package com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Clase3 {
    public static void main(String[] args) {
        String curso1 = "Java";
        String curso2 = "Python";
        String curso3 = "JavaScript";
        String curso4 = "C#";

        ArrayList<String> cursos = new ArrayList<>();

        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);


        List<String> cursosList = cursos.stream().sorted().collect(Collectors.toList());

        System.out.println(cursosList);

    }
}
