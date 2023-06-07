package org.latam.alura.tienda.modelo;

import javax.persistence.Embeddable;

@Embeddable
public class DatosPersonales {

    private String nombre;
    private String dpi;

    public DatosPersonales() {
        // Constructor sin argumentos
    }

    public DatosPersonales(String nombre, String dpi) {
        this.nombre = nombre;
        this.dpi = dpi;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }
}
