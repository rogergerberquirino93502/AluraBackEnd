package com.alura.model;

import java.util.LinkedList;
import java.util.List;

public class Alumno/* implements Comparable<Curso> */{

    private String nombre;
    private String tiempo;
    private List<Alura> requisitos = new LinkedList<>();

    public Alumno(String nombre, String tiempo) {
        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    public Alumno(String nombre, String tiempo, List<Alura> requisitos) {
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

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
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
