
package aula2;

public class Lampada {

    private boolean acesa;
    private String marca;
    private int potencia;

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
    
    public Lampada(boolean estado, String marca, int potencia){
        this.acesa = estado;
        this.marca = marca;
        this.potencia = potencia;
    }
    
    public void acender(){
        acesa = true;
    }
    public void apagar(){
        acesa = false;
    }
    
    
    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public boolean getAcesa() {
        return acesa;
    }

    public void setAcesa(boolean acesa) {
        this.acesa = acesa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
}