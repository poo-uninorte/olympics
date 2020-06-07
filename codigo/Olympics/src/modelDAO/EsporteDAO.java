/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDAO;

import java.util.ArrayList;
import java.util.List;
import model.Esporte;


/**
 *
 * @author Caveirak52
 */
public class EsporteDAO{

    public List<Esporte> Buscar() {
        List<Esporte> esporte = new ArrayList<>();
        
        return esporte;
    }

    public boolean Salvar(Esporte esporte) {
        
        return true;
    }

    
    public boolean Editar(Esporte esporte) {
        return true;
    }


    public boolean Excluir(int codigo) {
        return true;
    }
    
}
