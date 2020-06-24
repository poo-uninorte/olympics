/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import java.util.List;
import model.Atleta;
import modelDAO.AtletaDAO;

/**
 *
 * @author Caveirak52
 */
public class AtletaController{
    AtletaDAO atleta = new AtletaDAO();
    public List<Atleta> Buscar() {
        return this.atleta.Buscar();
    }

    public List<Atleta> BuscarPorNome(String nomeAtleta) {
        return this.atleta.BuscarPorNome(nomeAtleta);
    }
    
    
    
    
    public boolean Salvar(Atleta atleta) {
        return this.atleta.Salvar(atleta);
    }

    public boolean Editar(Atleta atleta) {
        return this.atleta.Editar(atleta);
    }

    public boolean Excluir(int codigo) {
        return this.atleta.Excluir(codigo);
    }
    
}
