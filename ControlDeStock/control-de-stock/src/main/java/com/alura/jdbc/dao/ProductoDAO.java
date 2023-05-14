package com.alura.jdbc.dao;

import com.alura.jdbc.factory.ConnectionFactory;
import com.alura.jdbc.modelo.Producto;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductoDAO {
    final private Connection con;

    public ProductoDAO(Connection con) {
        this.con = con;
    }

    public void guardar(Producto producto) {
        try (con) {
            final PreparedStatement stmt = con.prepareStatement(
                    "INSERT INTO producto " +
                            " (NOMBRE, DESCRIPCION, CANTIDAD) "
                            + " VALUES (?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS);
            try (stmt) {
                ejecutarRegistro(producto, stmt);
            }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
    }

    private void ejecutarRegistro(Producto producto, PreparedStatement stmt)
            throws SQLException {
        stmt.setString(1, producto.getNombre());
        stmt.setString(2, producto.getDescripcion());
        stmt.setInt(3, producto.getCantidad());

        stmt.execute();

        final ResultSet rs = stmt.getGeneratedKeys();
        try (rs) {
            while (rs.next()) {
                producto.setId(rs.getInt(1));
                System.out.println(
                        String.format(
                                "El id generado es: %s", producto ));
            }
        }
    }

    public List<Producto> listar() {
        List<Producto> resultado = new ArrayList<>();

        ConnectionFactory factory = new ConnectionFactory();
        final Connection con = factory.recuperaConexion();

        try (con) {
            final PreparedStatement stmt = con.prepareStatement("SELECT ID, NOMBRE, DESCRIPCION, CANTIDAD FROM producto");
            try (stmt) {
                stmt.execute();

                final ResultSet rs = stmt.getResultSet();

                try (rs) {
                    while (rs.next()) {
                        Producto fila = new Producto(rs.getInt("ID"),
                                rs.getString("NOMBRE"),
                                rs.getString("DESCRIPCION"),
                                rs.getInt("CANTIDAD")
                                );
                        resultado.add(fila);
                    }
                }
            }
            return resultado;
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public int eliminar(Integer id) {
        try {
            final PreparedStatement statement = con.prepareStatement("DELETE FROM PRODUCTO WHERE ID = ?");

            try (statement) {
                statement.setInt(1, id);
                statement.execute();

                int updateCount = statement.getUpdateCount();

                return updateCount;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public int modificar(String nombre, String descripcion, Integer cantidad, Integer id) {
        try {
            final PreparedStatement stmt = con.prepareStatement("UPDATE producto SET "
                    + "NOMBRE = ? "
                    + ",DESCRIPCION = 2"
                    + ", CANTIDAD = " + cantidad +
                    " WHERE ID = ? ");
            try (stmt) {
                stmt.setString(1, nombre);
                stmt.setString(2, descripcion);
                stmt.setInt(3, cantidad);
                stmt.setInt(4, id);
                stmt.execute();
                int cantidadModificada = stmt.getUpdateCount();
                return cantidadModificada;
            }
        }catch (SQLException e){
            throw new RuntimeException();
        }
    }
}
