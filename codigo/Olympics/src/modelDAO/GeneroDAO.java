/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDAO;

import java.util.ArrayList;
import java.util.List;
import model.Genero;


/**
 *
 * @author Caveirak52
 */
public class GeneroDAO {

 
    public List<Genero> Buscar() {
       List<Genero> genero = new ArrayList<>();
            
        return genero;
    }

 
    public boolean Salvar(Genero genero) {
        return true;
    }


    public boolean Editar(Genero genero) {
        return true;
    }


    public boolean Excluir(int codigo) {
        return true;

    }
    
}
