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
public class Modalidade {
    private int ID;
    private String Nome;
    private Esporte Esporte;

    public Modalidade() {
        Esporte esporte = new Esporte();
    }

    public Modalidade(int ID, String Nome, Esporte Esporte) {
        this.ID = ID;
        this.Nome = Nome;
        this.Esporte = Esporte;
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

    public Esporte getEsporte() {
        return Esporte;
    }

    public void setEsporte(Esporte Esporte) {
        this.Esporte = Esporte;
    }
    
    
}
