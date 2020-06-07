/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import java.util.List;
import model.Pais;
import modelDAO.PaisDAO;

/**
 *
 * @author Caveirak52
 */
public class PaisController {
    PaisDAO pais = new PaisDAO();
   
    public List<Pais> Buscar() {
       return pais.Buscar();
    }

   
    public boolean Salvar(Pais paises) {
       return this.pais.Salvar(paises);
    }

 
    public boolean Editar(Pais paises) {
        return this.pais.Editar(paises);
    }

   
    public boolean Excluir(int codigo) {
       return this.Excluir(codigo);
    }
    
}
