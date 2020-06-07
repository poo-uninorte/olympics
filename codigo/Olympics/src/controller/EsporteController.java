/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import java.util.List;
import model.Esporte;
import modelDAO.EsporteDAO;

/**
 *
 * @author Caveirak52
 */
public class EsporteController{
    EsporteDAO esporte = new EsporteDAO();
    
    public List<Esporte> Buscar() {
        return this.esporte.Buscar();
    }

    public boolean Salvar(Esporte esporte) {
        return this.esporte.Salvar(esporte);
    }

    public boolean Editar(Esporte esporte) {
       return this.esporte.Editar(esporte);
    }

    public boolean Excluir(int codigo) {
      return this.esporte.Excluir(codigo);
    }
    
}
