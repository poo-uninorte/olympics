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
public class Premiacao {
    private int ID_Premiacao;
    private Atleta atleta;
    private Modalidade modalidade;
    private Medalha medalha;

    public Premiacao() {
    }

    public Premiacao(int ID_Premiacao, Atleta atleta, Modalidade modalidade, Medalha medalha) {
        this.ID_Premiacao = ID_Premiacao;
        this.atleta = atleta;
        this.modalidade = modalidade;
        this.medalha = medalha;
    }

    public Premiacao(Atleta atleta, Modalidade modalidade, Medalha medalha) {
        this.atleta = atleta;
        this.modalidade = modalidade;
        this.medalha = medalha;
    }

    public int getID_Premiacao() {
        return ID_Premiacao;
    }

    public void setID_Premiacao(int ID_Premiacao) {
        this.ID_Premiacao = ID_Premiacao;
    }

    public Atleta getAtleta() {
        return atleta;
    }

    public void setAtleta(Atleta atleta) {
        this.atleta = atleta;
    }

    public Modalidade getModalidade() {
        return modalidade;
    }

    public void setModalidade(Modalidade modalidade) {
        this.modalidade = modalidade;
    }

    public Medalha getMedalha() {
        return medalha;
    }

    public void setMedalha(Medalha medalha) {
        this.medalha = medalha;
    }
    
    
    
    
}
