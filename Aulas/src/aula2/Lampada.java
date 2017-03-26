
package aula2;

public class Lampada {

    boolean acesa;
    String marca;
    
    public Lampada(){
        acesa = false;
        marca = "";
        
    }
    
    public Lampada(String marca){
        acesa = false;
        this.marca = marca;
    }
    
    public Lampada(boolean estado){
        this.acesa = false;
    }
    
    public Lampada(boolean estado, String marca){
        this.acesa = estado;
        this.marca = marca;
    }
    
    public void acender(){
        acesa = true;
    }
    public void apagar(){
        acesa = false;
    }
    
}