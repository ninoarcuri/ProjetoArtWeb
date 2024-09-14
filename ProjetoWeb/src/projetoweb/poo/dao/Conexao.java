
package projetoweb.poo.dao;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private String statusConexao = "Não conectado!";

    public String getStatusConexao() {
        return statusConexao;
    }

    public Connection getConexao() {
        Connection conn = null;
        String driveName = "com.mysql.jdbc.Driver";
        String servidor = "localhost";
        String schema = "ProjetoWeb";
        String usuario = "root";
        String senha = "";
		
        String url = "jdbc:mysql://" + servidor + "/" + schema;
        try {
            Class.forName(driveName);
            conn = (Connection) DriverManager.getConnection(url, usuario, senha);

            if (conn != null) {
                statusConexao = "Conectado com sucesso!";
            } else {
                statusConexao = "Erro na conexão";
            }
        } catch (ClassNotFoundException | SQLException ex) {
            statusConexao = ex.getMessage();
        }

        return conn;
    }

    public boolean fecharConexao() {
        try {
            getConexao().close();
            statusConexao = "Fechado com sucesso!";
        } catch (SQLException e) {
            statusConexao = "Erro: " + e.getMessage();
            return false;
        }
        return true;
    }
    
}
