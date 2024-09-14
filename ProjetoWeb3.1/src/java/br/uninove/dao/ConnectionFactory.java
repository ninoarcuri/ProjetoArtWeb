package br.uninove.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private static final String urlDB = "jdbc:derby://localhost:1527/ArtWebBD";
    private static String usuario = "artweb";
    private static String senha = "artweb123";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(urlDB, usuario, senha);
    }
}
