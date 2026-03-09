package biblioteca;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alexey
 */
public class LibroTest {
    
    private Libro libro;

    @BeforeClass
    public static void setUpClass() throws Exception {
    }
    
    @Before
    public void setUp() {
        libro = new Libro("Don Quijote", "IDBN001", 876, 15.56);
    }

    /**
     * Test of getTitulo method, of class Libro.
     */
    @Test
    public void testGetTitulo() {
        System.out.println("getTitulo");
        Libro instance = libro;
        String expResult = "Don Quijote";
        String result = instance.getTitulo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getIsbn method, of class Libro.
     */
    @Test
    public void testGetIsbn() {
        System.out.println("getIsbn");
        Libro instance = libro;
        String expResult = "IDBN001";
        String result = instance.getIsbn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getPaginas method, of class Libro.
     */
    @Test
    public void testGetPaginas() {
        System.out.println("getPaginas");
        Libro instance = libro;
        int expResult = 876;
        int result = instance.getPaginas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getPrecioBase method, of class Libro.
     */
    @Test
    public void testGetPrecioBase() {
        System.out.println("getPrecioBase");
        Libro instance = libro;
        double expResult = 15.56;
        double result = instance.getPrecioBase();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of incrementaPaginas method, of class Libro.
     */
    @Test
    public void testIncrementaPaginas() {
        System.out.println("incrementaPaginas");
        int x = 10;
        Libro instance = libro;
        instance.incrementaPaginas(x);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of decrementaPaginas method, of class Libro.
     */
    @Test
    public void testDecrementaPaginas() {
        System.out.println("decrementaPaginas");
        int x = 10;
        Libro instance = libro;
        instance.decrementaPaginas(x);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of calcularTiempoLectura method, of class Libro.
     */
    @Test
    public void testCalcularTiempoLectura() {
        System.out.println("calcularTiempoLectura");
        int minutosPorPagina = 10;
        Libro instance = libro;
        int expResult = 8760;
        int result = instance.calcularTiempoLectura(minutosPorPagina);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
    
}
