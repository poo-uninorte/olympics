/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDAO;

import java.util.ArrayList;
import java.util.List;
import model.Pais;


/**
 *
 * @author Caveirak52
 */
public class PaisDAO{

    public List<Pais> Buscar() {
       List<Pais> pais = new ArrayList();
        
        return pais;
    }

    public boolean Salvar(Pais pais) {
        return true;
    }

    public boolean Editar(Pais pais) {
        return true;
    }

    public boolean Excluir(int condigo) {
       return true;
    }
    
}
