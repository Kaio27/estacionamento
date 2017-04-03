/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author a120065
 */
public class Estacionamento {
    
    //ArrayList<Vaga> vagas = new ArrayList();
    List<Vaga> vagas;
    private int quant;
    

    public List<Vaga> getVagas() {
        return vagas;
    }

    public void setVagas(List<Vaga> vagas) {
        this.vagas = vagas;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }
    public Estacionamento(int vagas){
        this.quant = vagas;
       this.vagas = new ArrayList<Vaga>(vagas);
    }
    public boolean cheia(int vagas){
        if(this.vagas.size() == vagas){
            return true;
        }
        return false;
    }
    
    public void adicionarCarro(Vaga aux){
        if(cheia(this.quant)){
            System.out.println("Estacionamento cheio");
        }else{
        vagas.add(aux);
        }
    }
    
    public void removerCarro(Vaga aux){
        aux.saidaData = LocalDate.now();
        aux.saidaHora = LocalTime.now();
         long horas = ChronoUnit.HOURS.between(aux.saidaHora, aux.entradaHora);
         long dias = ChronoUnit.DAYS.between(aux.saidaData, aux.entradaData);
         double preco = 0;
         if(dias!=0){
             dias = dias * 24; // 24 horas
         }
         horas =+ dias;
         if(horas>1 && dias>0){
             preco =+ 4;
             preco =+ dias*2;
             preco =+ (horas-1)*2;
        }else if(horas==1 && dias==0){
             preco =+ 4;
         }else if(horas>=1 && dias==0){
             preco =+ 4;
             preco =+ (horas-1)*2;
            }
             
        System.out.println("Horas -> " + horas);
        System.out.println("Hora Inicio -> "+ aux.entradaHora);
        System.out.println("Hora Termino -> " + aux.saidaHora);
        System.out.println("Data Inicio -> " + aux.entradaData);
        System.out.println("Data Termino -> " + aux.saidaData);
        System.out.println("Preço total -> " + preco + " R$");
      vagas.remove(aux);
    }
    public void ListarVagas(){
        for(int i=0;i<this.vagas.size();i++){
               System.out.println("------------------- " + i + " -------------------");
               System.out.println("Placa -> " + this.vagas.get(i).getPlaca());
               System.out.println("Data de Entrada -> " + this.vagas.get(i).entradaData);
                System.out.println("Hora de Entrada -> " + this.vagas.get(i).entradaHora);
                System.out.println("------------------------------------------------");
        }
    }
    
    
}
