package org.latam.alura.tienda.dao;


import org.latam.alura.tienda.modelo.Cliente;

import javax.persistence.EntityManager;
import java.math.BigDecimal;
import java.util.List;

public class ClienteDAO {


    private EntityManager em;

    public ClienteDAO(EntityManager em){
        this.em = em;
    }

    public void Guardar(Cliente Cliente){
        this.em.persist(Cliente);
    }

    public Cliente consultaPorId(Long id){
        return em.find(Cliente.class, id);
    }

    public List<Cliente> ConsultaTodos(){
        String jpql = "SELECT p FROM Cliente AS p";
        return em.createQuery(jpql, Cliente.class).getResultList();
    }

    public List<Cliente> consultaPorNombre(String nombre){
        String jpql = "SELECT p FROM Cliente AS p WHERE p.nombre = :nombre";
        return em.createQuery(jpql, Cliente.class).setParameter("nombre", nombre).getResultList();
    }

    public List<Cliente> consultaPorNombreDeCategoria(String nombre){
        String jpql = "SELECT p FROM Cliente AS p WHERE p.categoria.nombre = :nombre";
        return em.createQuery(jpql, Cliente.class).setParameter("nombre", nombre).getResultList();
    }

    public BigDecimal consultaPrecioPorNombre(String nombre){
        String jpql = "SELECT p.precio FROM Cliente AS p WHERE p.nombre = :nombre";
        return em.createQuery(jpql, BigDecimal.class).setParameter("nombre", nombre).getSingleResult();
    }
}
