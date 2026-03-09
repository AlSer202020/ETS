package biblioteca;

/**
 *
 * @author Alexey
 */
public class Prestamo {
    private int prestamo;

    public Prestamo(int dias) {
        prestamo = dias;
    }
    /**
     * @return the prestamo
     */
    public boolean getPrestamo() {
        return prestamo <= 30;
    }
    
    public void renovarPrestamo(int diasAdicionales) {
        prestamo += diasAdicionales;
    }
    
    public int diasRestantes() {
        return prestamo;
    }
}
