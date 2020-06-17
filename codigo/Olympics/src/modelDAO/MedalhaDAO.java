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
import model.Medalha;

/**
 *
 * @author Caveirak52
 */
public class MedalhaDAO {
    ConnectionFactory con = new ConnectionFactory();
  
  
    public List<Medalha> Buscar() {
       List<Medalha> ListaMedalha = new ArrayList<>();
        con.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM Medalha";
        
        try {
            stmt = con.criarPreparedStatement(sql);
            rs = stmt.executeQuery();
            
            while (rs.next()) {                
                Medalha meda = new Medalha();
                meda.setID(rs.getInt("ID_Medalha"));
                meda.setNome(rs.getString("Nome"));
                ListaMedalha.add(meda);
            }
            con.closeConnection();
        } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e);
        con.closeConnection();
        }
  
        return ListaMedalha;
    }

    public boolean Salvar(Medalha medalha) {
       con.getConnection();
       String sql = "INSERT INTO Medalha(Nome) values(?)";
       PreparedStatement stmt = con.criarPreparedStatement(sql, Statement.RETURN_GENERATED_KEYS);
       
        try {
            stmt.setString(1, medalha.getNome());
            stmt.executeUpdate();
            con.closeConnection();
             return true;
        } catch (Exception e) {
           
            con.closeConnection();
            return false;
        }
    }

    
    public boolean Editar(Medalha medalha) {
        return true;
    }

    
    public boolean Excluir(int codigo) {
       return true;
    }
    
}
