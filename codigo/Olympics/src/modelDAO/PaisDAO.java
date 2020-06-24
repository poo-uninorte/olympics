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

import model.Pais;


/**
 *
 * @author Caveirak52
 */
public class PaisDAO{
    ConnectionFactory con = new ConnectionFactory();
    
    public List<Pais> Buscar() {
       List<Pais> ListaPais = new ArrayList<>();
       con.getConnection();
       PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM Pais";
       
        try {
            stmt = con.criarPreparedStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Pais pais = new Pais();
                pais.setID(rs.getInt("ID_Pais"));
                pais.setNome(rs.getString("Nome"));
                ListaPais.add(pais);
            }
            con.closeConnection();
        } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e);
        con.closeConnection();
        }

        return ListaPais;
    }
    
    
     public List<Pais> BuscarPorNome(String NomePais) {
       List<Pais> ListaPais = new ArrayList<>();
       con.getConnection();
       PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM Pais WHERE Nome LIKE ?";
       
        try {
            stmt = con.criarPreparedStatement(sql);
             stmt.setString(1, '%'+NomePais+'%');
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Pais pais = new Pais();
                pais.setID(rs.getInt("ID_Pais"));
                pais.setNome(rs.getString("Nome"));
                ListaPais.add(pais);
            }
            con.closeConnection();
        } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e);
        con.closeConnection();
        }

        return ListaPais;
    }
    

    public boolean Salvar(Pais pais) {
        con.getConnection();
        String sql = "INSERT INTO Pais (Nome) values (?)";
        
        PreparedStatement stmt = con.criarPreparedStatement(sql, Statement.RETURN_GENERATED_KEYS);
        
        try {
            stmt.setString(1, pais.getNome());
            stmt.executeUpdate();
            con.closeConnection();
                return true;
            } catch (Exception ex) {
                con.closeConnection();
            return false;
            
        }
          
    }

    public boolean Editar(Pais pais) {
         con.getConnection();
        String sql = "UPDATE Pais SET Nome = ? WHERE ID_Pais = ?";
        
        PreparedStatement stmt = con.criarPreparedStatement(sql, Statement.RETURN_GENERATED_KEYS);
        
        try {
            stmt.setString(1, pais.getNome());
            stmt.setInt(2, pais.getID());
            stmt.executeUpdate();
            con.closeConnection();
                return true;
            } catch (Exception ex) {
                con.closeConnection();
            return false;
            
        }
    }

    public boolean Excluir(int cod) {
     con.getConnection();
        String sql = "DELETE FROM Pais WHERE ID_Pais = ?";
        
        PreparedStatement stmt = con.criarPreparedStatement(sql, Statement.RETURN_GENERATED_KEYS);
        
        try {
            stmt.setInt(1, cod);
            stmt.executeUpdate();
            
            
            con.closeConnection();
           return true;
        } catch (SQLException e) {
            con.closeConnection();
            return false;
        }
    }
    
}
