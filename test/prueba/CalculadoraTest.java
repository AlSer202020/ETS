/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package prueba;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Daw1
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }

    /**
     * Test of sumar method, of class Calculadora.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        int a = 5;
        int b = 3;
        Calculadora instance = new Calculadora();
        int expResult = 8;
        int result = instance.sumar(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of restar method, of class Calculadora.
     */
    @Test
    public void testRestar() {
        System.out.println("restar");
        int a = 5;
        int b = 3;
        Calculadora instance = new Calculadora();
        int expResult = 2;
        int result = instance.restar(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of multiplicar method, of class Calculadora.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        int a = 5;
        int b = 3;
        Calculadora instance = new Calculadora();
        int expResult = 15;
        int result = instance.multiplicar(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of dividir method, of class Calculadora.
     */
    @Test
    public void testDividir() {
        System.out.println("dividir");
        int a = 5;
        int b = 3;
        Calculadora instance = new Calculadora();
        int expResult = 1;
        int result = instance.dividir(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
