package com.alura.jdbc.dao;

import com.alura.jdbc.modelo.Categoria;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoriaDAO {

    private Connection con;
    public CategoriaDAO(Connection con) {
        this.con = con;
    }
        public List<Categoria> listar() {
            List<Categoria> resultado = new ArrayList<>();
            try {
            final PreparedStatement stmt = con.prepareStatement(
                    "SELECT ID, NOMBRE FROM CATEGORIA");
            try (stmt) {
                final ResultSet rs = stmt.executeQuery();
                try(rs){
                    while (rs.next()) {
                        var categoria = new Categoria(rs.getInt("ID"),
                                rs.getString("NOMBRE"));
                        resultado.add(categoria);
                    }
                };
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
            return resultado;
        }
}
