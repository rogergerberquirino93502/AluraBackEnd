package org.latam.alura.tienda.prueba;

import org.latam.alura.tienda.dao.CategoriaDAO;
import org.latam.alura.tienda.dao.ClienteDAO;
import org.latam.alura.tienda.dao.PedidoDAO;
import org.latam.alura.tienda.dao.ProductoDAO;
import org.latam.alura.tienda.modelo.*;
import org.latam.alura.tienda.utils.JPAUtils;
import org.latam.alura.tienda.vo.RelatorioDeVenta;

import javax.persistence.EntityManager;
import java.math.BigDecimal;
import java.util.List;

public class RegistroDeProducto {
    public static void main(String[] args) {
        registrarProducto();
        EntityManager em = JPAUtils.getEntityManager();
        ProductoDAO productoDAO = new ProductoDAO(JPAUtils.getEntityManager());
        Producto producto = productoDAO.consultaPorId(1L);

        ClienteDAO clienteDAO= new ClienteDAO(em);
        PedidoDAO pedidoDao = new PedidoDAO(em);

        Cliente cliente = new Cliente("Juan", "123456789");
        Pedido pedido = new Pedido(cliente);
        pedido.agregarItem(new ItemsPedido(5,producto, pedido));
        em.getTransaction().begin();

        clienteDAO.Guardar(cliente);
        pedidoDao.Guardar(pedido);

        em.getTransaction().commit();

        BigDecimal valorTotal = pedidoDao.valorTotalVendida();
        System.out.println("El valor total vendido es: " + valorTotal);

        List<RelatorioDeVenta> relatorio = pedidoDao.relatorioDeVentasVO();

        relatorio.forEach(System.out::println);



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
