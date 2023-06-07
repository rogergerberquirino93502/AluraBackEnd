package org.latam.alura.tienda.modelo;

import javax.persistence.*;


@Entity
@Table(name="clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Embeddable
    private DatosPersonales datosPersonales;
    private String nombre;
    private String dpi;

    public Cliente() {
    }

    public Cliente(String nombre, String dpi) {
        this.datosPersonales = new DatosPersonales(nombre, dpi);
    }

    public Long getId() {
        return id;
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
