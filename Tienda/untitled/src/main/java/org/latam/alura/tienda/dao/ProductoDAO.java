package org.latam.alura.tienda.dao;

import org.latam.alura.tienda.modelo.Producto;

import javax.persistence.EntityManager;
import java.util.List;

public class ProductoDAO {
    private EntityManager em;

    public ProductoDAO(EntityManager em){
        this.em = em;
    }

    public void Guardar(Producto producto){
        this.em.persist(producto);
    }

    public Producto consultaPorId(Long id){
        return em.find(Producto.class, id);
    }

    public List<Producto> ConsultaTodos(){
        String jpql = "SELECT p FROM Producto p";
        return em.createQuery(jpql, Producto.class).getResultList();
    }
}
