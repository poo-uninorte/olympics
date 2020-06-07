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
public class Esporte {
    private int ID;
    private String Nome;
    private  Modalidade Modalidade;

    public Esporte() {
        Modalidade = new Modalidade();
    }
    
    public Esporte(int ID, String Nome, Modalidade Modalidade) {
        this.ID = ID;
        this.Nome = Nome;
        this.Modalidade = Modalidade;
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

    public Modalidade getModalidade() {
        return Modalidade;
    }

    public void setModalidade(Modalidade Modalidade) {
        this.Modalidade = Modalidade;
    }

   
    
}
