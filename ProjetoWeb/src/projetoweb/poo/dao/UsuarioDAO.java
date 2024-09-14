
package projetoweb.poo.dao;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import projetoweb.poo.negocio.Usuario;

public class UsuarioDAO {
    
    public List<Usuario> getListarUsuario() {
        Conexao conn = new Conexao();
        Connection conexao = conn.getConexao();
        String sql = "SELECT * FROM usuario";
        List<Usuario> listUsuario = new ArrayList<>();
        try {
            PreparedStatement comando = conexao.prepareStatement(sql);
            ResultSet resultado = comando.executeQuery();
            while (resultado.next()) {
                Usuario objUsuario = new Usuario();
                objUsuario.setIduser(resultado.getInt("Iduser"));
                objUsuario.setNome(resultado.getString("Nome"));
                objUsuario.setSobrenome(resultado.getString("Sobrenome"));
                objUsuario.setIdade(resultado.getInt("Idade"));
                objUsuario.setSoxo(resultado.getString("Sexo"));
                objUsuario.setEndereço(resultado.getString("Endereço"));
                objUsuario.setEmail(resultado.getString("Email"));
                objUsuario.setUsuario(resultado.getString("Usuario"));
                objUsuario.setSenha(resultado.getString("Senha"));
                listUsuario.add(objUsuario);
            }
        } catch (SQLException ex) {

        }
        return listUsuario;
    }
    
    public boolean Clogin(String login, String senha) {
        Conexao conn = new Conexao();
        Connection conexao = conn.getConexao();
        String sql = ("SELECT * FROM usuario WHERE usuario =? and senha = ?");
        try {
            PreparedStatement comando = conexao.prepareStatement(sql);
            comando.setString(1, login);
            comando.setString(2, senha);
            ResultSet resultado = comando.executeQuery();

            return resultado.next();

        } catch (SQLException e) {
            return false;
        }
    }
    
    public boolean inserir(Usuario objuser) {
        try {
            Conexao conn = new Conexao();
            Connection conexao = conn.getConexao();
            String sql = "INSERT INTO `usuario` (`nome`, `sobrenome`, `idade`, `sexo`, `endereço`, `email`, `usuario`, `senha`)";
            
            sql += " VALUES(";
            sql += "'" + objuser.getNome() + "',"; //varchar
            sql += "'" + objuser.getSobrenome() + "',"; //vaechar
            sql +=  objuser.getIdade() + ","; //inteiro
            sql += "'" + objuser.getSoxo() + "',";//varchar 
            sql += "'" + objuser.getEndereço() + "',";//varchar 
            sql += "'" + objuser.getEmail() + "',";//varchar 
            sql += "'" + objuser.getUsuario() + "',"; //varchar 
            sql += "'" + objuser.getSenha() + "'"; //varchar 
            sql += " );";
            PreparedStatement comando = conexao.prepareStatement(sql);
            comando.executeUpdate(sql);
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
    
    public boolean deleteusuario(int iduser) {
        String sql = "delete from usuario WHERE iduser =?";
        Conexao conn = new Conexao();
        Connection conexao = conn.getConexao();

        try {
            PreparedStatement comando = conexao.prepareStatement(sql);
            comando.setInt(1, iduser);
            //execute delete sql stetement
            comando.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
}
