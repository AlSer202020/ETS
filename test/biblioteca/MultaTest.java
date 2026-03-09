package biblioteca;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alexey
 */
public class MultaTest {
    
    Multa multa;
    
    @Before
    public void setUp() {
        multa = new Multa(10.5);
    }

    /**
     * Test of calcularMulta method, of class Multa.
     */
    @Test
    public void testCalcularMulta() {
        System.out.println("calcularMulta");
        int diasRetraso = 10;
        Multa instance = multa;
        double expResult = 105;
        double result = instance.calcularMulta(diasRetraso);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of aplicarDescuento method, of class Multa.
     */
    @Test
    public void testAplicarDescuento() {
        System.out.println("aplicarDescuento");
        double porcentaje = 10.5;
        Multa instance = multa;
        instance.aplicarDescuento(porcentaje);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getMultaTotal method, of class Multa.
     */
    @Test
    public void testGetMultaTotal() {
        System.out.println("getMultaTotal");
        Multa instance = multa;
        double expResult = 10.5;
        double result = instance.getMultaTotal();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
