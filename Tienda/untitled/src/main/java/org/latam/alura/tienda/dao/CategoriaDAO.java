package org.latam.alura.tienda.dao;

import org.latam.alura.tienda.modelo.Categoria;
import org.latam.alura.tienda.modelo.Producto;

import javax.persistence.EntityManager;

public class CategoriaDAO {
    private EntityManager em;

    public CategoriaDAO(EntityManager em){
        this.em = em;
    }

    public void Guardar(Categoria categoria){
        this.em.persist(categoria);
    }

    public void Actualizar(Categoria categoria){
        this.em.merge(categoria);
    }

    public void Eliminar(Categoria categoria){
        categoria = em.merge(categoria);
        this.em.remove(categoria);
    }
}
