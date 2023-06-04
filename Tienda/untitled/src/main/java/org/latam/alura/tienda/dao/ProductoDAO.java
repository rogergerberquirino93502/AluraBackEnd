package org.latam.alura.tienda.dao;

import org.latam.alura.tienda.modelo.Producto;

import javax.persistence.EntityManager;
import java.math.BigDecimal;
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
        String jpql = "SELECT p FROM Producto AS p";
        return em.createQuery(jpql, Producto.class).getResultList();
    }

    public List<Producto> consultaPorNombre(String nombre){
        String jpql = "SELECT p FROM Producto AS p WHERE p.nombre = :nombre";
        return em.createQuery(jpql, Producto.class).setParameter("nombre", nombre).getResultList();
    }

    public List<Producto> consultaPorNombreDeCategoria(String nombre){
        String jpql = "SELECT p FROM Producto AS p WHERE p.categoria.nombre = :nombre";
        return em.createQuery(jpql, Producto.class).setParameter("nombre", nombre).getResultList();
    }

    public BigDecimal consultaPrecioPorNombre(String nombre){
        String jpql = "SELECT p.precio FROM Producto AS p WHERE p.nombre = :nombre";
        return em.createQuery(jpql, BigDecimal.class).setParameter("nombre", nombre).getSingleResult();
    }
}
