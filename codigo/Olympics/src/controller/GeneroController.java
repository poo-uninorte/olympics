/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import java.util.List;
import model.Genero;
import modelDAO.GeneroDAO;

/**
 *
 * @author Caveirak52
 */
public class GeneroController {
    GeneroDAO genero = new GeneroDAO();
    public List<Genero> Buscar() {
        return this.genero.Buscar();
    }

    public boolean Salvar(Genero genero) {
        
        return this.genero.Salvar(genero);
    }

    public boolean Editar(Genero genero) {
        return this.genero.Editar(genero);
        
    }

    public boolean Excluir(int codigo) {
        return this.Excluir(codigo);
    }
    
}
