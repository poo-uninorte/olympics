/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDAO;

import java.util.ArrayList;
import java.util.List;
import model.Atleta;


/**
 *
 * @author Caveirak52
 */
public class AtletaDAO{

    public List<Atleta> Buscar() {
       List<Atleta> atleta =  new ArrayList<>();
       
       return  atleta;
    }

    public boolean Salvar(Atleta atleta) {
       return true;
    }

    public boolean Editar(Atleta atleta) {
        return true;
    }

    public boolean Excluir(int codigo) {
        return true;
    }
    
}
