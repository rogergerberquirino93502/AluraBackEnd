package org.latam.alura.tienda.prueba;

import org.latam.alura.tienda.dao.CategoriaDAO;
import org.latam.alura.tienda.dao.ProductoDAO;
import org.latam.alura.tienda.modelo.Categoria;
import org.latam.alura.tienda.modelo.Producto;
import org.latam.alura.tienda.utils.JPAUtils;

import javax.persistence.EntityManager;
import java.math.BigDecimal;
import java.util.List;

public class RegistroDeProducto {
    public static void main(String[] args) {
        registrarProducto();
        EntityManager em = JPAUtils.getEntityManager();
        ProductoDAO productoDAO = new ProductoDAO(em);
        Producto producto = productoDAO.consultaPorId(1L);
        System.out.println(producto.getNombre());

        BigDecimal precio = productoDAO.consultaPrecioPorNombre("Xiaomi Redmi Note 9");
        System.out.println(precio);
       /* List<Producto> productos = productoDAO.consultaPorNombreDeCategoria("Celulares");
        productos.forEach(p -> System.out.println(p.getDescripcion()));*/
    }





    private static void registrarProducto() {
        Categoria celulares = new Categoria("Celulares");
        Producto celular = new Producto("Xiaomi Redmi Note 9", "Celular Xiaomi Redmi Note 9", new BigDecimal("200000"),  celulares);

        EntityManager em = JPAUtils.getEntityManager();
        ProductoDAO productoDAO = new ProductoDAO(em);
        CategoriaDAO categoriaDAO = new CategoriaDAO(em);

        em.getTransaction().begin();

        categoriaDAO.Guardar(celulares);
        productoDAO.Guardar(celular);

        em.getTransaction().commit();
        em.close();
    }
}
       /*   Categoria celulares = new Categoria("Celulares");
        Producto celular = new Producto("Xiaomi Redmi Note 9", "Celular Xiaomi Redmi Note 9", new BigDecimal("200000"),  celulares);

        EntityManager em = JPAUtils.getEntityManager();

        em.getTransaction().begin();
        em.persist(celulares);
        celulares.setNombre("LIBROS");

        em.flush();
        em.clear();

        celulares = em.merge(celulares);
        celulares.setNombre("SOFTWARE");

        em.flush();
        em.clear();

        celulares = em.merge(celulares);
        em.remove(celulares);
        em.flush();

        CategoriaDAO categoriaDAO = new CategoriaDAO(em);
        ProductoDAO productoDAO = new ProductoDAO(em);
        em.getTransaction().begin();
        categoriaDAO.Guardar(celulares);
        productoDAO.Guardar(celular);
        em.getTransaction().commit();
        em.close();*/