package br.uninove.dao;

import br.uninove.model.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class UsuarioDAO {

    private static Statement stm = null;

    public ArrayList<Usuario> getTodosUsuarios(Integer... idUser) throws SQLException {

        ArrayList<Usuario> usuarios = new ArrayList<>();
        String query = "SELECT * FROM \"tb_usuario\"";

        query += "ORDER BY \"idUser\" asc";
       
        stm = ConnectionFactory.getConnection().createStatement(
                ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

        ResultSet resultados = stm.executeQuery(query);

        while (resultados.next()) {
            Usuario u = new Usuario();
            
            u.setIdUser(resultados.getInt("idServ"));
            u.setLogin(resultados.getString("nome_servico"));
            u.setSenha(resultados.getString("descricao"));
                        
            usuarios.add(u);
        }

        stm.getConnection().close();
        
        return usuarios;
    }

}
