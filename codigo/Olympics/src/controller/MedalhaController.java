/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import java.util.List;
import model.Medalha;
import modelDAO.MedalhaDAO;

/**
 *
 * @author Caveirak52
 */
public class MedalhaController{
    MedalhaDAO medalha = new MedalhaDAO();
    
    public List<Medalha> Buscar() {
     return this.medalha.Buscar();
    }

    public boolean Salvar(Medalha medalha) {
              
       return this.medalha.Salvar(medalha);
    }

    public boolean Editar(Medalha medalha) {
       return  this.medalha.Editar(medalha);
    }

    public boolean Excluir(int codigo) {
       return this.medalha.Excluir(codigo);
    }
    
}
