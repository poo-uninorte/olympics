/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDAO;

import java.util.ArrayList;
import java.util.List;
import model.Medalha;

/**
 *
 * @author Caveirak52
 */
public class MedalhaDAO {

  
    public List<Medalha> Buscar() {
       List<Medalha> medalha = new ArrayList<>();
       
        return medalha;
    }

    public boolean Salvar(Medalha medalha) {
       
        return true;
    }

    
    public boolean Editar(Medalha medalha) {
        return true;
    }

    
    public boolean Excluir(int codigo) {
       return true;
    }
    
}
