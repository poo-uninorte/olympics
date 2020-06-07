/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;



import java.util.List;
import model.Modalidade;
import modelDAO.ModalidadeDAO;

/**
 *
 * @author Caveirak52
 */
public class ModalidadeController {
    ModalidadeDAO modalidade = new ModalidadeDAO();
    
    
     public List<Modalidade> Buscar() {
        return this.modalidade.Buscar();
    }
    
    public boolean Salvar(Modalidade modalidade) {
        return this.modalidade.Salvar(modalidade);
    }

    public boolean Editar(Modalidade modalidade) {
       return this.modalidade.Editar(modalidade);
    }

  

    public boolean Excluir(int codigo) {
        return this.modalidade.Excluir(codigo);
    }

   
    
}
