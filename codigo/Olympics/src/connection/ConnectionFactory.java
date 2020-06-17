/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Caveirak52
 */
public class ConnectionFactory {
    private Connection conexao = null;
    
    public boolean getConnection(){
        try {
            String url = "jdbc:sqlite:src/db/Olympics_DataBase.db";

            this.conexao = DriverManager.getConnection(url);
           
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro na conexao", JOptionPane.ERROR_MESSAGE);
           return false;
        }
        return true;
        
    }
    
     public boolean closeConnection(){
          try {
            if (this.conexao.isClosed() == false){
                this.conexao.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro no fechamento da conexao", JOptionPane.ERROR_MESSAGE);
            return false;
        }
          return true;
    }

   public PreparedStatement criarPreparedStatement (String pSQL, int RETURN_GENERATED_KEYS){
   
       try {
           return conexao.prepareStatement(pSQL,RETURN_GENERATED_KEYS);
       } catch (SQLException ex) {
           System.out.println(ex.getMessage());
           return null;
       }
   }
   
    public PreparedStatement criarPreparedStatement (String pSQL){
   
       try {
           return conexao.prepareStatement(pSQL);
       } catch (SQLException ex) {
           System.out.println(ex.getMessage());
           return null;
       }
   }

}
