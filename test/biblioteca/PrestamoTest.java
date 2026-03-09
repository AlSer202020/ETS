package biblioteca;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alexey
 */
public class PrestamoTest {
    
    Prestamo prestamo;
    
    @Before
    public void setUp() {
        prestamo = new Prestamo(10);
    }

    /**
     * Test of getPrestamo method, of class Prestamo.
     */
    @Test
    public void testGetPrestamo() {
        System.out.println("getPrestamo");
        Prestamo instance = prestamo;
        boolean expResult = true;
        boolean result = instance.getPrestamo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of renovarPrestamo method, of class Prestamo.
     */
    @Test
    public void testRenovarPrestamo() {
        System.out.println("renovarPrestamo");
        int diasAdicionales = 10;
        Prestamo instance = prestamo;
        instance.renovarPrestamo(diasAdicionales);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of diasRestantes method, of class Prestamo.
     */
    @Test
    public void testDiasRestantes() {
        System.out.println("diasRestantes");
        Prestamo instance = prestamo;
        int expResult = 10;
        int result = instance.diasRestantes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
