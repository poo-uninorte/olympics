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
       private Medalha TipoMedalha;
       private Modalidade Modalidade;
       private Genero Genero;
       private Pais Pais;

    public Atleta() {
      TipoMedalha = new Medalha ();
      Modalidade = new Modalidade();
      Genero = new Genero();
      Pais = new Pais();
    }

       
    public Atleta(int ID, String Nome, Medalha TipoMedalha, Modalidade Modalidade, Pais Pais) {
        this.ID = ID;
        this.Nome = Nome;
        this.TipoMedalha = TipoMedalha;
        this.Modalidade = Modalidade;
        this.Pais = Pais;
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
       

    public Medalha getTipoMedalha() {
        return TipoMedalha;
    }

    public void setTipoMedalha(Medalha TipoMedalha) {
        this.TipoMedalha = TipoMedalha;
    }

    public Modalidade getModalidade() {
        return Modalidade;
    }

    public void setModalidade(Modalidade Modalidade) {
        this.Modalidade = Modalidade;
    }

    public Pais getPais() {
        return Pais;
    }

    public void setPais(Pais Pais) {
        this.Pais = Pais;
    }
          
}
