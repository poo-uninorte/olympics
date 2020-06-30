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
import model.Atleta;


import model.Pais;


/**
 *
 * @author Caveirak52
 */
public class AtletaDAO{
  ConnectionFactory con = new ConnectionFactory();
    
  
  public List<Atleta> Buscar() {
       List<Atleta> ListAtleta =  new ArrayList<>();
       con.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       
       String sql="SELECT at.ID_Atleta as idAtleta, at.Nome as nomeAtleta,at.Genero as genero ,pa.Nome pais FROM "
               + "Pais pa join Atleta at on pa.ID_Pais = at.ID_Pais ";
               
       
       try {
          stmt = con.criarPreparedStatement(sql);
          rs = stmt.executeQuery();
          
          while(rs.next()){
              Atleta at = new Atleta();
              Pais pa = new Pais();
             
           
              at.setID(rs.getInt("idAtleta"));
              at.setNome(rs.getString("nomeAtleta"));
              at.setGenero(rs.getString("genero"));
              
              pa.setNome(rs.getString("pais"));
              at.setPais(pa);
              ListAtleta.add(at);
          }
          con.closeConnection();
      } catch (Exception e) {
            con.closeConnection();
            JOptionPane.showMessageDialog(null, e);
          
      }
       
       
       return  ListAtleta;
    }

  
    public List<Atleta> BuscarPorNome(String nomeAtleta) {
       List<Atleta> ListAtleta =  new ArrayList<>();
       con.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       
       String sql="SELECT at.ID_Atleta as idAtleta, at.Nome as nomeAtleta,at.Genero as genero ,pa.Nome pais FROM "
               + "Pais pa join Atleta at on pa.ID_Pais = at.ID_Pais "
               + "where at.Nome LIKE ? ";
               
       
       try {
           stmt = con.criarPreparedStatement(sql);
           stmt.setString(1, '%'+nomeAtleta+'%');
           rs = stmt.executeQuery();
          
          while(rs.next()){
              Atleta at = new Atleta();
              Pais pa = new Pais();
            
              at.setID(rs.getInt("idAtleta"));
              at.setNome(rs.getString("nomeAtleta"));
              at.setGenero(rs.getString("genero"));
              
              pa.setNome(rs.getString("pais"));
              at.setPais(pa);
     
              
              ListAtleta.add(at);

              
          }
          con.closeConnection();
      } catch (Exception e) {
            con.closeConnection();
            JOptionPane.showMessageDialog(null, e);
          
      }
       
       
       return  ListAtleta;
    }
  
  
      public List<Atleta> BuscarTotalComMedalha() {
       List<Atleta> ListAtleta =  new ArrayList<>();
       con.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       
       String sql="SELECT * FROM Podio_Atleta;";
               
       
       try {
          stmt = con.criarPreparedStatement(sql);
          rs = stmt.executeQuery();
          
          while(rs.next()){
              Atleta at = new Atleta();
         
              at.setNome(rs.getString("NomeAtleta"));
              at.setGenero(rs.getString("GeneroAtleta"));
              at.setQTDOuro(rs.getInt("Medalha_de_Ouro"));
              at.setQTDPrata(rs.getInt("Medalha_de_Prata"));
              at.setQTDBronze(rs.getInt("Medalha_de_Bronze"));
              at.setQTDTotal(rs.getInt("Total_de_Medalha"));
             
              ListAtleta.add(at);
          }
          con.closeConnection();
      } catch (Exception e) {
            con.closeConnection();
            JOptionPane.showMessageDialog(null, e);
          
      }
       
       return  ListAtleta;
    }
    
      
       public List<Atleta> BuscarTotalComMedalhaPorId(int IdPais) {
       List<Atleta> ListAtleta =  new ArrayList<>();
       con.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       
       String sql="select * from Atleta_Por_Pais where IdPais = ?;";
               
       
       try {
          stmt = con.criarPreparedStatement(sql);
          stmt.setInt(1,IdPais);
          rs = stmt.executeQuery();
          
          while(rs.next()){
              Atleta at = new Atleta();
         
              at.setNome(rs.getString("NomeAtleta"));
              at.setGenero(rs.getString("GeneroAtleta"));
              at.setQTDOuro(rs.getInt("Medalha_de_Ouro"));
              at.setQTDPrata(rs.getInt("Medalha_de_Prata"));
              at.setQTDBronze(rs.getInt("Medalha_de_Bronze"));
              at.setQTDTotal(rs.getInt("Total_de_Medalha"));
             
              ListAtleta.add(at);
          }
          con.closeConnection();
      } catch (Exception e) {
            con.closeConnection();
            JOptionPane.showMessageDialog(null, e);
          
      }
       
       return  ListAtleta;
    }
    
      
      
    public List<Atleta> BuscarTotalComMedalhaPorNome(String NomeAtleta) {
       List<Atleta> ListAtleta =  new ArrayList<>();
       con.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       
       String sql="SELECT * FROM Podio_Atleta WHERE NomeAtleta LIKE ?;";
               
       
       try {
           
          stmt = con.criarPreparedStatement(sql);
          stmt.setString(1, '%'+NomeAtleta+'%');
          rs = stmt.executeQuery();
          
          while(rs.next()){
              Atleta at = new Atleta();
         
              at.setNome(rs.getString("NomeAtleta"));
              at.setGenero(rs.getString("GeneroAtleta"));
              at.setQTDOuro(rs.getInt("Medalha_de_Ouro"));
              at.setQTDPrata(rs.getInt("Medalha_de_Prata"));
              at.setQTDBronze(rs.getInt("Medalha_de_Bronze"));
              at.setQTDTotal(rs.getInt("Total_de_Medalha"));
             
              ListAtleta.add(at);
          }
          con.closeConnection();
      } catch (Exception e) {
            con.closeConnection();
            JOptionPane.showMessageDialog(null, e);
          
      }
       
       return  ListAtleta;
    }
    
    
  
    public boolean Salvar(Atleta atleta) {
        
       con.getConnection();
       String sqlCadastroAtleta = "INSERT INTO Atleta(Nome,Genero,ID_Pais) values (?,?,?)";
       PreparedStatement stmt = con.criarPreparedStatement(sqlCadastroAtleta, Statement.RETURN_GENERATED_KEYS);
           
        try {
            stmt.setString(1, atleta.getNome());
            stmt.setString(2, atleta.getGenero());
            stmt.setInt(3, atleta.getPais().getID());
            stmt.executeUpdate();

            con.closeConnection();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            con.closeConnection();
            return false;
        }

    }

    public boolean Editar(Atleta atleta) {
       con.getConnection();
       String sqlCadastroAtleta = "UPDATE Atleta SET Nome = ?, Genero = ?, ID_Pais = ? WHERE ID_Atleta = ?";
       PreparedStatement stmt = con.criarPreparedStatement(sqlCadastroAtleta, Statement.RETURN_GENERATED_KEYS);
           
        try {
            stmt.setString(1, atleta.getNome());
            stmt.setString(2, atleta.getGenero());
            stmt.setInt(3, atleta.getPais().getID());
            stmt.setInt(4, atleta.getID());
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
        String sql = "DELETE FROM Atleta WHERE ID_Atleta = ?";
        
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
