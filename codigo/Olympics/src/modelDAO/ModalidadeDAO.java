/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDAO;

import java.util.ArrayList;
import java.util.List;
import model.Modalidade;


/**
 *
 * @author Caveirak52
 */
public class ModalidadeDAO{
    
    
    public List<Modalidade> Buscar() {
        List<Modalidade> modalidade = new ArrayList<>();
        
        return modalidade;
    }

 
    public boolean Salvar(Modalidade modalidade) {
        return true;
    }

  
    public boolean Editar(Modalidade modalidade) {
        return true;
    }

  
    public boolean Excluir(int codigo) {
      return true;
    }
    
}
