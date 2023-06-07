package org.latam.alura.tienda.vo;

import java.time.LocalDate;

public class RelatorioDeVenta {

    private String nombreDelProducto;
    private Long cantidadDeProducto;
    private LocalDate fechaDeVenta;

    public RelatorioDeVenta(String nombreDelProducto, Long cantidadDeProducto, LocalDate fechaDeVenta) {
        this.nombreDelProducto = nombreDelProducto;
        this.cantidadDeProducto = cantidadDeProducto;
        this.fechaDeVenta = fechaDeVenta;
    }

    public String getNombreDelProducto() {
        return nombreDelProducto;
    }

    public void setNombreDelProducto(String nombreDelProducto) {
        this.nombreDelProducto = nombreDelProducto;
    }

    public Long getCantidadDeProducto() {
        return cantidadDeProducto;
    }

    public void setCantidadDeProducto(Long cantidadDeProducto) {
        this.cantidadDeProducto = cantidadDeProducto;
    }

    public LocalDate getFechaDeVenta() {
        return fechaDeVenta;
    }

    public void setFechaDeVenta(LocalDate fechaDeVenta) {
        this.fechaDeVenta = fechaDeVenta;
    }

    @Override
    public String toString() {
        return "RelatorioDeVenta{" +
                "nombreDelProducto='" + nombreDelProducto + '\'' +
                ", cantidadDeProducto=" + cantidadDeProducto +
                ", fechaDeVenta=" + fechaDeVenta +
                '}';
    }
}
