package com.alura.jdbc.controller;

import com.alura.jdbc.factory.ConnectionFactory;
import com.alura.jdbc.modelo.Producto;
import com.alura.jdbc.dao.ProductoDAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductoController {
	private ProductoDAO productoDAO;

	public ProductoController() {
		this.productoDAO = productoDAO = new ProductoDAO(new ConnectionFactory().recuperaConexion());

	}
	public int modificar(String nombre, String descripcion, Integer cantidad, Integer id) {
		return productoDAO.modificar(nombre, descripcion, cantidad, id);
	}
	public int eliminar(Integer id)  {
		return productoDAO.eliminar(id);
	}

	public List<Producto> listar(){
		return productoDAO.listar();
	}


    public void guardar(Producto producto){
		productoDAO.guardar(producto);
	}

}
