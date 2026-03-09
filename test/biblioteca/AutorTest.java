package biblioteca;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alexey
 */
public class AutorTest {
    
    
    private Autor autor;
    
    @Before
    public void setUp() {
        autor = new Autor("Autor1", 10);
    }

    /**
     * Test of getNombre method, of class Autor.
     */
    @Test
    public void testGetNombreCompleto() {
        System.out.println("getNombre");
        Autor instance = autor;
        String expResult = "Autor1";
        String result = instance.getNombreCompleto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getLibrosPublicados method, of class Autor.
     */
    @Test
    public void testGetLibrosPublicados() {
        System.out.println("getLibrosPublicados");
        Autor instance = autor;
        int expResult = 10;
        int result = autor.getLibrosPublicados();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of invrementObra method, of class Autor.
     */
    @Test
    public void testinvcrementaObra() {
        System.out.println("invcrementaObra");
        Autor instance = autor;
        instance.invcrementaObra();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of calcularPromedioLibrosPorAno method, of class Autor.
     */
    @Test
    public void testCalcularPromedioLibrosPorAno() {
        System.out.println("calcularPromedioLibrosPorAno");
        int anos = 2;
        Autor instance = autor;
        int expResult = 5;
        int result = instance.calcularPromedioLibrosPorAno(anos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
