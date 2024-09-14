package br.uninove.dao;

import br.uninove.model.Cliente;
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
            Cliente cli = new Cliente();
            
            
            u.setIdUser(resultados.getInt("idUser"));
            u.setLogin(resultados.getString("login"));
            u.setSenha(resultados.getString("senha"));
            
            cli.setNomeUsuario(resultados.getString("nomeUsuario"));
            cli.setSobrenomeUsuario(resultados.getString("sobrenomeUsuario"));
            cli.setData_nasc(resultados.getString("data_nasc"));
            cli.setEndereco(resultados.getString("endereco" ));
            cli.setBairro(resultados.getString("bairro" ));
            cli.setCep(resultados.getString("cep"));
            cli.setTelefone(resultados.getString("telefone" ));
            cli.setCelular(resultados.getString("celular"));
            cli.setEmail(resultados.getString("email"));
            
           
            u.setCliente(cli);            
            usuarios.add(u);
        }

        stm.getConnection().close();
        
        return usuarios;
    }

}
