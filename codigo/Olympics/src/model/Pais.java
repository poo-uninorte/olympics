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

    public Pais() {
    }

    public Pais(int ID, String Nome) {
        this.ID = ID;
        this.Nome = Nome;
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

   
       
}
