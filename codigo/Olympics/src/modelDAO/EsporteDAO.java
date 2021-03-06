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


/**
 *
 * @author Caveirak52
 */
public class EsporteDAO{
    ConnectionFactory con = new ConnectionFactory();
    Esporte esporte = new Esporte();
    
    public List<Esporte> Buscar() {
        List<Esporte> Listaesporte = new ArrayList<>();
        con.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM Esporte";
        
        
        try {
        stmt = con.criarPreparedStatement(sql);
        rs = stmt.executeQuery();
            while (rs.next()) {                
                Esporte esp = new Esporte();
                esp.setID(rs.getInt("ID_Esporte"));
                esp.setNome(rs.getString("Nome"));
                Listaesporte.add(esp);
            }
        
        con.closeConnection();
        } catch (SQLException e) {
            con.closeConnection();
            JOptionPane.showMessageDialog(null, e);
        }
    
        return Listaesporte;
    }

        public List<Esporte> BuscarPorNome(String NomeEsporte) {
        List<Esporte> Listaesporte = new ArrayList<>();
        con.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM Esporte WHERE Nome LIKE ?";
        
        
        try {
        stmt = con.criarPreparedStatement(sql);
         stmt.setString(1, '%'+NomeEsporte+'%');
        rs = stmt.executeQuery();
            while (rs.next()) {                
                Esporte esp = new Esporte();
                esp.setID(rs.getInt("ID_Esporte"));
                esp.setNome(rs.getString("Nome"));
                Listaesporte.add(esp);
            }
        
        con.closeConnection();
        } catch (SQLException e) {
            con.closeConnection();
            JOptionPane.showMessageDialog(null, e);
        }
    
        return Listaesporte;
    }
    
    
    public boolean Salvar(Esporte esporte) {
        con.getConnection();
       String sql = "INSERT INTO Esporte(Nome) values(?)";
       PreparedStatement stmt = con.criarPreparedStatement(sql, Statement.RETURN_GENERATED_KEYS);
       
        try {
            stmt.setString(1, esporte.getNome());
            stmt.executeUpdate();
            con.closeConnection();
             return true;
        } catch (Exception e) {
           
            con.closeConnection();
            return false;
        }
        
        
    }

    
    public boolean Editar(Esporte esporte) {
       con.getConnection();
       String sql = "UPDATE Esporte SET Nome = ? WHERE ID_Esporte = ?";
       PreparedStatement stmt = con.criarPreparedStatement(sql, Statement.RETURN_GENERATED_KEYS);
       
        try {
            stmt.setString(1, esporte.getNome());
            stmt.setInt(2, esporte.getID());
            stmt.executeUpdate();
            con.closeConnection();
             return true;
        } catch (SQLException e) {
           
            con.closeConnection();
            return false;
        }
        
    }


    public boolean Excluir(int cod) {
        con.getConnection();
        String sql = "DELETE FROM Esporte WHERE ID_Esporte = ?";
        
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
