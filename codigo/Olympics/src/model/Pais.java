/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Caveirak52
 */
public class Pais {
       private int ID;
       private String Nome;
       private int QTDOuro;
       private int QTDPrata;
       private int QTDBronze;
       private int QTDTotal; 
       
    public Pais() {
        
    }
    
    
    public Pais(int ID, String Nome) {
        this.ID = ID;
        this.Nome = Nome;
    }

    public Pais(int ID, String Nome, int QTDOuro, int QTDPrata, int QTDBronze, int QTDTotal) {
        this.ID = ID;
        this.Nome = Nome;
        this.QTDOuro = QTDOuro;
        this.QTDPrata = QTDPrata;
        this.QTDBronze = QTDBronze;
        this.QTDTotal = QTDTotal;
    }

    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getQTDOuro() {
        return QTDOuro;
    }

    public void setQTDOuro(int QTDOuro) {
        this.QTDOuro = QTDOuro;
    }

    public int getQTDPrata() {
        return QTDPrata;
    }

    public void setQTDPrata(int QTDPrata) {
        this.QTDPrata = QTDPrata;
    }

    public int getQTDBronze() {
        return QTDBronze;
    }

    public void setQTDBronze(int QTDBronze) {
        this.QTDBronze = QTDBronze;
    }

    public int getQTDTotal() {
        return QTDTotal;
    }

    public void setQTDTotal(int QTDTotal) {
        this.QTDTotal = QTDTotal;
    }

       @Override
   public String toString(){
      return this.getNome();
   
   }
       
}
