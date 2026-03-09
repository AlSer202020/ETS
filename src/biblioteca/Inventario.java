package biblioteca;

import java.util.Arrays;

/**
 *
 * @author Alexey
 */
public class Inventario {
    private Libro[] libros;
    private Libro[] librosPrestados;
    
    public Inventario(Libro[] libros) {
        this.libros = libros;
        this.librosPrestados = new Libro[0];
    }
    
    public void agregarLibro(Libro libro) {
        this.libros = Arrays.copyOf(this.libros, this.libros.length + 1);
        this.libros[this.libros.length - 1] = libro;
    }
    
    public Libro buscarLibroPorIsbn(String isbn) {
        for (int i = 0; i < libros.length; i++) {
            if (libros[i].getIsbn() == isbn) {
                return libros[i];
            }
        }
        System.out.println("Libro no encontrado");
        return libros[0];
    }
    
    public void prestarLibro(Libro libro) {
        this.librosPrestados = Arrays.copyOf(this.librosPrestados,
                this.librosPrestados.length + 1);
        this.librosPrestados[this.librosPrestados.length - 1] = libro;
    }
    
    public void devolverLibro(Libro libro) {
        int pos = 0;
        for (int i = 0; i < libros.length; i++) {
            if (libros[i].getIsbn() == libro.getIsbn()) {
                pos = i;
            }
        }
        Libro[] auxLibrosArray = new Libro[libros.length-1];
        int contador = 0; 
        for (int i = 0; i < libros.length; i++) {
            if (contador != pos) {
                auxLibrosArray[contador] = libros[i];
                contador++;
            }
        }
        libros = auxLibrosArray;
    }
}
