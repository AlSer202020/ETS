package biblioteca;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alexey
 */
public class InventarioTest {

    Inventario inventario;

    Libro libro1 = new Libro("Libro1", "ISBN001", 200, 35.5);
    Libro libro2 = new Libro("Libro2", "ISBN002", 300, 45.5);
    Libro libro3 = new Libro("Libro3", "ISBN003", 400, 55.5);
    Libro libro4 = new Libro("Libro4", "ISBN004", 500, 65.5);

    @Before
    public void setUp() {

        Libro[] libros = {libro1, libro2, libro3, libro4};
        inventario = new Inventario(libros);
    }

    /**
     * Test of agregarLibro method, of class Inventario.
     */
    @Test
    public void testAgregarLibro() {
        System.out.println("agregarLibro");
        Libro libro = new Libro("Libro5", "ISBN005", 1000, 999.99);
        Inventario instance = inventario;
        instance.agregarLibro(libro);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of buscarLibroPorIsbn method, of class Inventario.
     */
    @Test
    public void testBuscarLibroPorIsbn() {
        System.out.println("buscarLibroPorIsbn");
        String isbn = "ISBN001";
        Inventario instance = inventario;
        Libro expResult = libro1;
        Libro result = instance.buscarLibroPorIsbn(isbn);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of prestarLibro method, of class Inventario.
     */
    @Test
    public void testPrestarLibro() {
        System.out.println("prestarLibro");
        Libro libro = libro1;
        Inventario instance = inventario;
        instance.prestarLibro(libro);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of devolverLibro method, of class Inventario.
     */
    @Test
    public void testDevolverLibro() {
        System.out.println("devolverLibro");
        Libro libro = libro1;
        Inventario instance = inventario;
        instance.devolverLibro(libro);
        // TODO review the generated test code and remove the default call to fail.
    }

}
