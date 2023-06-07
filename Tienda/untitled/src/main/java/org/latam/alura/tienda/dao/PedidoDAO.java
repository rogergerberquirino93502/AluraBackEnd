package org.latam.alura.tienda.dao;


import org.latam.alura.tienda.modelo.Pedido;
import org.latam.alura.tienda.vo.RelatorioDeVenta;

import javax.persistence.EntityManager;
import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

public class PedidoDAO {


    private EntityManager em;

    public PedidoDAO(EntityManager em){
        this.em = em;
    }

    public void Guardar(Pedido Pedido){
        this.em.persist(Pedido);
    }

    public Pedido consultaPorId(Long id){
        return em.find(Pedido.class, id);
    }

    public List<Pedido> ConsultaTodos(){
        String jpql = "SELECT p FROM Pedido AS p";
        return em.createQuery(jpql, Pedido.class).getResultList();
    }

    public BigDecimal valorTotalVendida(){
        String jpql = "SELECT MAX(p.total) FROM Pedido AS p";
        return em.createQuery(jpql, BigDecimal.class).getSingleResult();
    }

    public List<Object[]> relatorioDeVentas(){
        String jpql = "SELECT new org.latam.alura.tienda.vo.RelatorioDeVenta(producto.nombre,"
                +"SUM(item.cantidad),"
                +"MAX(pedido.fecha)) "
                +"FROM Pedido pedido "
                +"JOIN pedido.items item "
                +"JOIN item.producto producto "
                +"GROUP BY producto.nombre "
                +"ORDER BY item.cantidad DESC";
        return em.createQuery(jpql, Object[].class).getResultList();
    }
    public List<RelatorioDeVenta> relatorioDeVentasVO(){
        String jpql = "SELECT new org.latam.alura.tienda.vo.RelatorioDeVenta(producto.nombre,"
                +"SUM(item.cantidad),"
                +"MAX(pedido.fecha)) "
                +"FROM Pedido pedido "
                +"JOIN pedido.items item "
                +"JOIN item.producto producto "
                +"GROUP BY producto.nombre "
                +"ORDER BY item.cantidad DESC";
        return em.createQuery(jpql, RelatorioDeVenta.class).getResultList();
    }

    public Pedido consultarPedidoConCliente(Long id){
        String jpql = "SELECT p FROM Pedido p JOIN FETCH p.cliente WHERE p.id = :id";
        return em.createQuery(jpql, Pedido.class).setParameter("id", id).getSingleResult();
    }
}
