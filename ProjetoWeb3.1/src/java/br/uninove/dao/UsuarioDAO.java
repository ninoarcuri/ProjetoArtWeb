package br.uninove.dao;

import br.uninove.model.Cliente;
import br.uninove.model.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class UsuarioDAO {

    private static Statement stm = null;
    static int contUser=0;

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
            cli.setEndereco(resultados.getString("endereco"));
            cli.setBairro(resultados.getString("bairro"));
            cli.setCep(resultados.getString("cep"));
            cli.setTelefone(resultados.getString("telefone"));
            cli.setCelular(resultados.getString("celular"));
            cli.setEmail(resultados.getString("email"));

            u.setCliente(cli);
            usuarios.add(u);
        }

        stm.getConnection().close();

        return usuarios;
    }

    public boolean checkLogin(String login, String senha) {
        String query = "SELECT * FROM ARTWEB.\"tb_usuario\" \n"
                + "WHERE \"login\"='" + login + "' and \"senha\"='" + senha + "'";
        boolean check = false;

        try {
            stm = ConnectionFactory.getConnection().createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            stm.setCursorName(login);
            stm.setCursorName(senha);

            ResultSet resultados = stm.executeQuery(query);

            if (resultados.next()) {
                check = true;
            }

            stm.getConnection().close();

        } catch (Exception e) {

        }
        return check;
    }

   
    public void Cadastrar(Usuario user) {
        String query = "INSERT INTO \"tb_usuario\" (\"nomeUsuario\",\"sobrenomeUsuario\",\"data_nasc\",\"endereco\",\"bairro\",\"cep\",\"telefone\",\"celular\",\"email\",\"login\",\"senha\",\"adm\") \n"
                + "VALUES ('" + user.cliente.getNomeUsuario() + "', '" + user.cliente.getSobrenomeUsuario() + "', '" + user.cliente.getData_nasc() + "', '" + user.cliente.getEndereco()+ "', '" + user.cliente.getBairro() + "', '" + user.cliente.getCep() + "', '" + user.cliente.getTelefone() + "', '" + user.cliente.getCelular() + "', '" + user.cliente.getEmail() + "', '" + user.getLogin() + "','" + user.getSenha() + "',false);";     

        try {
            
            stm = ConnectionFactory.getConnection().createStatement();
            int row = stm.executeUpdate(query);
            contUser++;
            
            if(row > 0){
                System.out.println("Fununcia PORAAA");
            }
            
            
                                   
            
            } catch (SQLException e) {
            
        }
    }

}
