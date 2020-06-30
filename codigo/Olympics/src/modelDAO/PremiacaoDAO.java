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
import model.Medalha;
import model.Modalidade;
import model.Premiacao;


/**
 *
 * @author Caveirak52
 */
public class PremiacaoDAO {
    ConnectionFactory con = new ConnectionFactory();
    
    public List<Premiacao> Buscar(){
    List<Premiacao> ListaPremiaca = new ArrayList<>();
    con.getConnection();
    PreparedStatement stmt = null;
    ResultSet rs = null;
    
    String sql = "SELECT pr.ID_Premiacao as idPremi,at.ID_Atleta as idAtleta,at.Nome as nomeAtleta," +
                    "mo.ID_Modalidade as idModalidade,mo.Nome as nomeModalidade,me.ID_Medalha as idMedalha,me.Nome as nomeMedalha " +
                    "FROM Premiacao pr left join Atleta at on at.ID_Atleta = pr.ID_Atleta " +
                    "join Medalha me on pr.ID_Medalha = me.ID_Medalha " +
                    "join Modalidade mo on pr.ID_Modalidade = mo.ID_Modalidade;";
    
    
        try {
            stmt = con.criarPreparedStatement(sql, Statement.RETURN_GENERATED_KEYS);
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                Premiacao premiacao = new Premiacao();
                Atleta atleta = new Atleta();
                Modalidade modalidade = new Modalidade();
                Medalha medalha = new Medalha();
                
                atleta.setID(rs.getInt("idAtleta"));
                atleta.setNome(rs.getString("nomeAtleta"));
                
                modalidade.setID(rs.getInt("idModalidade"));
                modalidade.setNome(rs.getString("nomeModalidade"));
                
                medalha.setID(rs.getInt("idMedalha"));
                medalha.setNome(rs.getString("nomeMedalha"));
                
                premiacao.setID_Premiacao(rs.getInt("idPremi"));
                
                premiacao.setAtleta(atleta);
                premiacao.setModalidade(modalidade);
                premiacao.setMedalha(medalha);
                ListaPremiaca.add(premiacao);
                
            }
           
            con.closeConnection();
        } catch (SQLException e) {
            con.closeConnection();
            JOptionPane.showMessageDialog(null, e);
        }
    return ListaPremiaca;
    }
    
    
    public List<Premiacao> BuscarPorNome(String nomeAtleta){
       List<Premiacao> ListaPremiacao = new ArrayList<>();
    con.getConnection();
    PreparedStatement stmt = null;
    ResultSet rs = null;
    
    String sql = "SELECT pr.ID_Premiacao as idPremi,at.ID_Atleta as idAtleta,at.Nome as nomeAtleta," +
                    "mo.ID_Modalidade as idModalidade,mo.Nome as nomeModalidade,me.ID_Medalha as idMedalha,me.Nome as nomeMedalha " +
                    "FROM Atleta at join Premiacao pr on at.ID_Atleta = pr.ID_Atleta " +
                    "join Medalha me on pr.ID_Medalha = me.ID_Medalha " +
                    "join Modalidade mo on pr.ID_Modalidade = mo.ID_Modalidade " +
                    "where nomeAtleta LIKE ? ";
    
    
        try {
            stmt = con.criarPreparedStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, '%'+nomeAtleta+'%');
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                Premiacao premiacao = new Premiacao();
                Atleta atleta = new Atleta();
                Modalidade modalidade = new Modalidade();
                Medalha medalha = new Medalha();
                
                atleta.setID(rs.getInt("idAtleta"));
                atleta.setNome(rs.getString("nomeAtleta"));
                
                modalidade.setID(rs.getInt("idModalidade"));
                modalidade.setNome(rs.getString("nomeModalidade"));
                
                medalha.setID(rs.getInt("idMedalha"));
                medalha.setNome(rs.getString("nomeMedalha"));
                
                premiacao.setID_Premiacao(rs.getInt("idPremi"));
                
                premiacao.setAtleta(atleta);
                premiacao.setModalidade(modalidade);
                premiacao.setMedalha(medalha);
                ListaPremiacao.add(premiacao);
                
            }
        }catch (SQLException e) {
            con.closeConnection();
            JOptionPane.showMessageDialog(null, e);
        }
    
    return ListaPremiacao;
    }
    
    public boolean salvar(Premiacao premiacao) throws SQLException{
        con.getConnection();
        PreparedStatement Consultastmt = null;
        ResultSet Consultars = null;
        String ConsultaSQL="SELECT * FROM Premiacao WHERE ID_Modalidade = ? and ID_Medalha = ?";
      
           Consultastmt = con.criarPreparedStatement(ConsultaSQL, Statement.RETURN_GENERATED_KEYS);
           Consultastmt.setInt(1, premiacao.getModalidade().getID());
           Consultastmt.setInt(2, premiacao.getMedalha().getID());
           Consultars = Consultastmt.executeQuery();
           
      if(!Consultars.isBeforeFirst()){
            
           
        String sql = "INSERT INTO Premiacao(ID_Modalidade,ID_Atleta,ID_Medalha) values (?,?,?)";
        
        PreparedStatement stmt = con.criarPreparedStatement(sql, Statement.RETURN_GENERATED_KEYS);
        
        try {
            stmt.setInt(1, premiacao.getModalidade().getID());
            stmt.setInt(2, premiacao.getAtleta().getID());
            stmt.setInt(3, premiacao.getMedalha().getID());
            stmt.executeUpdate();
            
            
            con.closeConnection();
           return true;
        
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            con.closeConnection();
            return false;
        }
      }else{
          con.closeConnection();
      JOptionPane.showMessageDialog(null, "Ja existe outro Atleta com essa premiação!","Premiação Impossível",JOptionPane.ERROR_MESSAGE);
       return false;
        
      }
        
    
    }
    
    public boolean editar(Premiacao premiacao) throws SQLException{
        con.getConnection();
          PreparedStatement Consultastmt = null;
        ResultSet Consultars = null;
        String ConsultaSQL="SELECT * FROM Premiacao WHERE ID_Modalidade = ? and ID_Medalha = ?";
      
           Consultastmt = con.criarPreparedStatement(ConsultaSQL, Statement.RETURN_GENERATED_KEYS);
           Consultastmt.setInt(1, premiacao.getModalidade().getID());
           Consultastmt.setInt(2, premiacao.getMedalha().getID());
           Consultars = Consultastmt.executeQuery();
        
        
         if(!Consultars.isBeforeFirst()){
        String sql = "UPDATE Premiacao SET ID_Modalidade = ?,ID_Atleta = ? , ID_Medalha = ? WHERE ID_Premiacao = ?";
        
        PreparedStatement stmt = con.criarPreparedStatement(sql, Statement.RETURN_GENERATED_KEYS);
        
        try {
            stmt.setInt(1, premiacao.getModalidade().getID());
            stmt.setInt(2, premiacao.getAtleta().getID());
            stmt.setInt(3, premiacao.getMedalha().getID());
            stmt.setInt(4, premiacao.getID_Premiacao());
            stmt.executeUpdate();
            
            
            con.closeConnection();
           return true;
        } catch (SQLException e) {
            con.closeConnection();
            return false;
        }
         }else{
              con.closeConnection();
             JOptionPane.showMessageDialog(null, "Ja existe outro Atleta com essa premiação!","Premiação Impossível",JOptionPane.ERROR_MESSAGE);
         return false;
         }
    }
    
    public boolean excluir(int cod){
    con.getConnection();
        String sql = "DELETE FROM Premiacao WHERE ID_Premiacao = ?";
        
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
