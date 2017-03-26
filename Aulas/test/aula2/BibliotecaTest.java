/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author GARCIA
 */
public class BibliotecaTest {
    
    public BibliotecaTest() {
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
    public void testBiblioteca() {
        Biblioteca blib = new Biblioteca();
        Autor autor = new Autor(1,"Jose Alencar");
        Livro aux = new Livro("Programando em C", 121, "Brasil", autor);
        Autor autor2 = new Autor(2, "Machado de Assis");
        Livro aux2 = new Livro("Programando em Java", 2017, "Alemanha", autor2);
        
        blib.adicionarLivro(aux);
        blib.adicionarLivro(aux2);
        
//        blib.emprestarLivro("Programando em C");
        System.out.println(aux.titulo.toString());
        System.out.println(aux.ano);
        System.out.println(aux.nomeDaEditora);
        System.out.println(aux.autor.nome.toString()); 
//        System.out.println(aux.emprestado);


        System.out.println(aux2.titulo.toString());
        System.out.println(aux2.ano);
        System.out.println(aux2.nomeDaEditora);
        System.out.println(aux2.autor.nome.toString()); 
//        blib.removerLivro(aux2);
//        if(!blib.Livros.contains(aux2)){
//            System.out.println("Livro nao existe!");
//        }else{
//            System.out.println("Livro Existe!");
//        }
        
        
        
       
        
        
        
    }
    
}
