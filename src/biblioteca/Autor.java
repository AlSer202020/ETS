package biblioteca;

/**
 *
 * @author Alexey
 */
public class Autor {
    private String nombreCompleto;
    private int librosPublicados;

    public Autor(String nombre, int librosPublicados) {
        this.nombreCompleto = nombre;
        this.librosPublicados = librosPublicados;
    }
    
    /**
     * @return the nombre
     */
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    /**
     * @return the librosPublicados
     */
    public int getLibrosPublicados() {
        return librosPublicados;
    }
    
    public void invcrementaObra() {
        librosPublicados++;
    }
    
    public int calcularPromedioLibrosPorAno(int anos) {
        if (librosPublicados > anos) {
            return librosPublicados / anos;
        } else {
            return 0;
        }
    }
}
