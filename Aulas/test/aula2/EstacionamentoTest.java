/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author a120065
 */
public class EstacionamentoTest {
    
    public EstacionamentoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testEstacionamento() {
        Estacionamento est = new Estacionamento(20);
        Vaga vagaD = new Vaga("AOZ-1234");
        Vaga vagaD2 = new Vaga("AOA-1222");
        Vaga vagaD3 = new Vaga("BBC-2234");
        Vaga vagaD4 = new Vaga("ABC-2222"); 
        Vaga vagaD5 = new Vaga("BDC-3464");
        Vaga vagaD6 = new Vaga("HEL- 6666");
        Vaga vagaD7 = new Vaga("CEU-000");
        Vaga vagaD8 = new Vaga("AAA-1111"); 
         Vaga vagaD9 = new Vaga("BBB-9234");
        Vaga vagaD10 = new Vaga("AAC-2232"); 
        
        
        est.adicionarCarro(vagaD);
        est.adicionarCarro(vagaD2);
        est.adicionarCarro(vagaD3);
        est.adicionarCarro(vagaD4);
        est.adicionarCarro(vagaD5);
        est.adicionarCarro(vagaD6);
        est.adicionarCarro(vagaD7);
        est.adicionarCarro(vagaD8);
        est.adicionarCarro(vagaD9);
        est.adicionarCarro(vagaD10);
        
        //System.out.println(vagaD.placa);
        est.ListarVagas();
        est.removerCarro(vagaD6);
        est.ListarVagas();
//        if(!est.vagas.contains(vagaD)){
//            System.out.println("Carro nao existe!");
//        }else{
//            System.out.println("Carro Existe!");
//        }
        
    }
    
}
