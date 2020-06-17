/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDAO;

import connection.ConnectionFactory;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Esporte;
import model.Modalidade;


/**
 *
 * @author Caveirak52
 */
public class ModalidadeDAO{
    ConnectionFactory con = new ConnectionFactory();
    
    public List<Modalidade> Buscar() {
        List<Modalidade> ListaModalidade = new ArrayList<>();
        con.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "SELECT "
                + "m.ID_Modalidade,"
                + "m.Nome,"
                + "e.Nome "
                + "FROM "
                + "Modalidade m, "
                + "Esporte e "
                + "where "
                + "m.ID_Esporte = e.ID_Esporte";
        
        try {
            stmt = con.criarPreparedStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()){
              
               Modalidade modalidade = new Modalidade();
               Esporte esporte = new Esporte();
               modalidade.setID(rs.getInt(1));
               modalidade.setNome(rs.getString(2));
               esporte.setNome(rs.getString(3));
               modalidade.setEsporte(esporte) ;
               ListaModalidade.add(modalidade);
               
            }
              con.closeConnection();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            con.closeConnection();
        }
        
        return ListaModalidade;
    }

 
    public boolean Salvar(Modalidade modalidade) {
        con.getConnection();
        String sql = "INSERT INTO Modalidade(Nome,ID_Esporte) values(?,?)";
        PreparedStatement stmt = con.criarPreparedStatement(sql, Statement.RETURN_GENERATED_KEYS);
        
        try {
            stmt.setString(1, modalidade.getNome());
            stmt.setInt(2, modalidade.getEsporte().getID());
            stmt.executeUpdate();
            con.closeConnection();
            return true;
        } catch (Exception e) {
        return false;    
        }
        
    }

  
    public boolean Editar(Modalidade modalidade) {
        return true;
    }

  
    public boolean Excluir(int codigo) {
      return true;
    }
    
}
