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
public class Genero {
    private int ID;
    private String Tipo;

    public Genero() {
    }
    
   
    public Genero(int ID, String Tipo) {
        this.ID = ID;
        this.Tipo = Tipo;
    }

    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    
    
}
