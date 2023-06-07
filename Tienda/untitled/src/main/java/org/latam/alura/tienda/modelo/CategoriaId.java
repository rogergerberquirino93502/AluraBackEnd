package org.latam.alura.tienda.modelo;

import javax.persistence.Embedded;
import java.io.Serializable;

@Embedded
public class CategoriaId implements Serializable {

    private String nombre;
    private String password;

    public CategoriaId() {
    }

    public CategoriaId(String nombre, String password) {
        this.nombre = nombre;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
