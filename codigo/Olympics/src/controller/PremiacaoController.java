/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import model.Premiacao;
import modelDAO.PremiacaoDAO;



/**
 *
 * @author Caveirak52
 */
public class PremiacaoController {
 PremiacaoDAO premiacao = new PremiacaoDAO();  
    
    public List<Premiacao> Buscar(){
    
    return this.premiacao.Buscar();
    }
    
    
    public List<Premiacao> BuscarPorNome(String Nome){
    return this.premiacao.BuscarPorNome(Nome);
    }
    
    public boolean salvar(Premiacao premiacao){
    
    return this.premiacao.salvar(premiacao);
    }
    
    public boolean editar(Premiacao premiacao){
    
    return this.premiacao.editar(premiacao);
    }
    
    public boolean excluir(int cod){
    
    return this.premiacao.excluir(cod);
    }
    
    
    
    
    
    
    
}
