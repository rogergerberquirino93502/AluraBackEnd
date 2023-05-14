package com.alura.jdbc.pruebas;

import com.alura.jdbc.factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class PruebaDelete {
    public static void main(String[] args) throws SQLException {
        Connection con = new ConnectionFactory().recuperaConexion();
        Statement stm = con.createStatement();
        stm.execute("DELETE FROM producto WHERE ID = 99");
        System.out.println("Se eliminaron " + stm.getUpdateCount() + " registros");
    }
}
