package com.alura.model;

import java.util.*;

public class Curso/* implements Comparable<Curso> */{

    private String nombre;
    private int tiempo;
    private List<Alura> requisitos = new LinkedList<>();


    private Collections<Alumno> alumnos = new HashSet<>();

    //private Collections<Alumno> alumnos = new LinkedHashSet<>();
    private Map<String, Alumno> alumnoMap = new HashMap<>();

    public Curso(String nombre, int tiempo) {
        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    public Curso(String nombre, int tiempo, List<Alura> requisitos) {
        this.nombre = nombre;
        this.tiempo = tiempo;
        this.requisitos = requisitos;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public List<Alura> getRequisitos() {

        return requisitos;
    }

    public void setRequisitos(List<Alura> requisitos) {

        this.requisitos = requisitos;
    }

    public void addClase(Alura clase){
        this.requisitos.add(clase);
    }

    @Override
    public String toString() {
        return this.nombre;
    }

    /*@Override
    public int compareTo(Curso o) {
        return this.nombre.compareTo(o.getNombre());
    }*/
}
