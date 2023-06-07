package org.latam.alura.tienda.modelo;

import javax.persistence.Entity;

@Entity
public class Libros extends Producto{
    private int paginas;
    private String autor;

    public Libros() {
    }

    public Libros(int paginas, String autor) {
        this.paginas = paginas;
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
