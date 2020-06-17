/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDAO;

import connection.ConnectionFactory;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Atleta;
import model.Esporte;
import model.Medalha;
import model.Modalidade;
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
       
       String sql="SELECT a.Nome as nomeAtleta,a.Genero as genero ,p.Nome pais,e.Nome as esporte,mo.Nome as modalidade,me.Nome as Medalha FROM "
               + "Medalha me join Atleta a on me.ID_Medalha = a.ID_Medalha "
               + "join Pais p  on a.ID_Pais = p.ID_Pais "
               + "join  Modalidade_Atleta ma on ma.ID_Atleta = a.ID_Atleta "
               + "join Modalidade mo on ma.ID_Modalidade = mo.ID_Modalidade "
               + "join Esporte e on mo.ID_Esporte = e.ID_Esporte";
               
       
       try {
          stmt = con.criarPreparedStatement(sql);
          rs = stmt.executeQuery();
          
          while(rs.next()){
              Atleta at = new Atleta();
              Pais pa = new Pais();
              Esporte es = new Esporte();
              Modalidade mo = new Modalidade();
              Medalha me = new Medalha();
              
              at.setNome(rs.getString("nomeAtleta"));
              at.setGenero(rs.getString("genero"));
              
              pa.setNome(rs.getString("pais"));
              at.setPais(pa);
              
              es.setNome(rs.getString("esporte"));
              
              mo.setEsporte(es);
              mo.setNome(rs.getString("modalidade"));
              at.setModalidade(mo);
              
              me.setNome(rs.getString("Medalha"));
              at.setTipoMedalha(me);
              
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
       String sqlCadastroAtleta = "INSERT INTO Atleta(Nome,Genero,ID_Pais,ID_Medalha) values (?,?,?,?)";
       String sqlMaxIdAtleta = "SELECT max(ID_Atleta) from Atleta";
       String sqlCadastraAtletaModalidade = "INSERT INTO Modalidade_Atleta(ID_Modalidade,ID_Atleta) values (?,?)";
       PreparedStatement stmt = con.criarPreparedStatement(sqlCadastroAtleta, Statement.RETURN_GENERATED_KEYS);
       PreparedStatement stmt2 = con.criarPreparedStatement(sqlMaxIdAtleta, Statement.RETURN_GENERATED_KEYS);
       PreparedStatement stmt3 = con.criarPreparedStatement(sqlCadastraAtletaModalidade, Statement.RETURN_GENERATED_KEYS);
       ResultSet rsQuery = null;
       
        
        try {
            stmt.setString(1, atleta.getNome());
            stmt.setString(2, atleta.getGenero());
            stmt.setInt(3, atleta.getPais().getID());
            stmt.setInt(4, atleta.getTipoMedalha().getID());
            stmt.executeUpdate();
            
            rsQuery = stmt2.executeQuery();
                      
            stmt3.setInt(1, atleta.getModalidade().getID());
            stmt3.setInt(2, rsQuery.getInt(1));
            
            stmt3.executeUpdate();
            con.closeConnection();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            con.closeConnection();
            return false;
        }

    }

    public boolean Editar(Atleta atleta) {
        return true;
    }

    public boolean Excluir(int codigo) {
        return true;
    }
    
}
