package br.uninove.dao;

import br.uninove.model.Servico;
import br.uninove.model.Cliente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ServicoDAO {

    private static Statement stm = null;

    public ArrayList<Servico> getTodosServicos(Integer... idServico) throws SQLException {

        ArrayList<Servico> servicos = new ArrayList<>();
        String query = "SELECT * FROM \"tb_servico\"";

        query += "ORDER BY \"idServ\" asc";
       
        stm = ConnectionFactory.getConnection().createStatement(
                ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

        ResultSet resultados = stm.executeQuery(query);

        while (resultados.next()) {
            Servico a = new Servico();
            
            a.setIdServ(resultados.getInt("idServ"));
            a.setNome_servico(resultados.getString("nome_servico"));
            a.setDescricao(resultados.getString("descricao"));
            a.setTipo(resultados.getString("tipo"));
            a.setValor(resultados.getDouble("valor"));
            
            servicos.add(a);
        }

        stm.getConnection().close();
        
        return servicos;
    }

}
