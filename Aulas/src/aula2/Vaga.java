/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author a120065
 */
public class Vaga {
    String placa;
    LocalDate entradaData;
    LocalDate saidaData;
    LocalTime entradaHora;
    LocalTime saidaHora;

    
    public Vaga(){
        placa = "";
    }
    
   public Vaga(String placa){
       this.placa = placa;
       this.entradaData = LocalDate.now();
       this.saidaData = null;
       this.entradaHora = LocalTime.now();
       this.saidaHora = null;
       
        
    }
    
   public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public LocalDate getEntradaData() {
        return entradaData;
    }

    public void setEntradaData(LocalDate entradaData) {
        this.entradaData = entradaData;
    }

    public LocalDate getSaidaData() {
        return saidaData;
    }

    public void setSaidaData(LocalDate saidaData) {
        this.saidaData = saidaData;
    }

    public LocalTime getEntradaHora() {
        return entradaHora;
    }

    public void setEntradaHora(LocalTime entradaHora) {
        this.entradaHora = entradaHora;
    }

    public LocalTime getSaidaHora() {
        return saidaHora;
    }

    public void setSaidaHora(LocalTime saidaHora) {
        this.saidaHora = saidaHora;
    }
    

    
    
}
