
package model;

/**
 *
 * @author Caveirak52
 */
public class Medalha {
    private int ID;
    private String Nome;
 

    public Medalha() {
    }
 
    
    public Medalha(int ID, String Nome) {
        this.ID = ID;
        this.Nome = Nome;
    }    
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String toString(){
        return this.getNome();
    }
    
}
