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
public class Atleta {
       private int ID;
       private String Nome;
       private int NumeroMedalhaOuro;
       private int NumeroMedalhaPrata;
       private int NumeroMedalhaBronze;
       private int TotalMelha;

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

    public int getNumeroMedalhaOuro() {
        return NumeroMedalhaOuro;
    }

    public void setNumeroMedalhaOuro(int NumeroMedalhaOuro) {
        this.NumeroMedalhaOuro = NumeroMedalhaOuro;
    }

    public int getNumeroMedalhaPrata() {
        return NumeroMedalhaPrata;
    }

    public void setNumeroMedalhaPrata(int NumeroMedalhaPrata) {
        this.NumeroMedalhaPrata = NumeroMedalhaPrata;
    }

    public int getNumeroMedalhaBronze() {
        return NumeroMedalhaBronze;
    }

    public void setNumeroMedalhaBronze(int NumeroMedalhaBronze) {
        this.NumeroMedalhaBronze = NumeroMedalhaBronze;
    }

    public int getTotalMelha() {
        return TotalMelha;
    }

    public void setTotalMelha(int TotalMelha) {
        this.TotalMelha = TotalMelha;
    }
       
       
       
       
}
