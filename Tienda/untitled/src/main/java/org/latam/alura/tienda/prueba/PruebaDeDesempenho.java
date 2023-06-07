package org.latam.alura.tienda.prueba;

import org.latam.alura.tienda.dao.PedidoDAO;
import org.latam.alura.tienda.modelo.Pedido;
import org.latam.alura.tienda.utils.JPAUtils;

import javax.persistence.EntityManager;

public class PruebaDeDesempenho {
    public static void main(String[] args) {
        //LoadRecords.cargarRegistros();

        EntityManager em = JPAUtils.getEntityManager();

        PedidoDAO pedidoDao = new PedidoDAO(em);
        Pedido pedidoconcliente = pedidoDao.consultarPedidoConCliente(1L);
        em.close();

  //      System.out.println(pedido.getFecha());
    //    System.out.println(pedido.getItems().size());
        System.out.println(pedidoconcliente.getCliente().getNombre());
    }
}
