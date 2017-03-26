/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2;

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
public class LampadaTest {
    
    public LampadaTest() {
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
    public void testLampada() {
        Lampada l = new Lampada("Phillips");
//        System.out.println(l.acesa);
        l.acender();
        System.out.println(l.acesa);
        System.out.println(l.marca);
//        l.apagar();
//        System.out.println(l.acesa);
    }
    
} 
