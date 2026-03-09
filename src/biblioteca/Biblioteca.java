package biblioteca;

/**
 *
 * @author Alexey
 */
public class Biblioteca {

    public static void main(String[] args) {
        //Creación de un libro
        Libro donQuijote = new Libro("Don Quijote", "ISBN001", 1257, 39.99);

        // probar fonciones quetTitulo(), getIdbn(), getPaginas() y getPrecioBase()
        System.out.println("Nombre del libro: " + donQuijote.getTitulo()
                + "\nISBN: " + donQuijote.getIsbn()
                + "\nNúmero de páginas: " + donQuijote.getPaginas()
                + "\nPrecio base: " + donQuijote.getPrecioBase());

        // Probar funciones incrementaPaginas() y decrementaPaginas()
        donQuijote.incrementaPaginas(10);
        System.out.println("Número de páginas despues del incremento: "
                + donQuijote.getPaginas());
        donQuijote.decrementaPaginas(15);
        System.out.println("N'umero de páginas despues del decremento: "
                + donQuijote.getPaginas());

        // Probar función calcularTiempoLectura()
        System.out.println("Tiempo necesario para leer el libro"
                + " (10 minutos por página): "
                + donQuijote.calcularTiempoLectura(10));

        // Creación de un autor
        Autor autor = new Autor("Miguel de Cervantes", 10);

        // Probar funciones GetNombreCompleto() y getLibrosPublicados()
        System.out.println("Nombre Completo: " + autor.getNombreCompleto()
                + "\nLibros publicados: " + autor.getLibrosPublicados());

        // Probar función incrementaObra()
        autor.invcrementaObra();
        System.out.println("Libros publicados despues del incremento: "
                + autor.getLibrosPublicados());

        // Probar función promedioLibrosPorAno()
        System.out.println("Promedio por 10 años: "
                + autor.calcularPromedioLibrosPorAno(10));

        // Creación de un préstamo
        Prestamo prestamo1 = new Prestamo(28);

        // Probar función getPrestamo()
        System.out.println("El prestamo es válido: " + prestamo1.getPrestamo());

        // Probar función renovarPrestamo()
        prestamo1.renovarPrestamo(2);

        // Probar función diasRestantes()
        System.out.println("Dias restantes de prestamo: "
                + prestamo1.diasRestantes());

        // Creación de una multa
        Multa multa1 = new Multa(10);

        // Probar función calcularMulta()
        System.out.println("Multa pro 10 días de retraso: "
                + multa1.calcularMulta(10));
        
       // Probar función aplicarDescuento()
       multa1.aplicarDescuento(25);
       
       // Probar función getMultaTotal()
        System.out.println("Multa total: " + multa1.getMultaTotal());
        
        // Creación de un inventario
        Libro celestina = new Libro("La Celestina", "ISBN002", 845, 25.99);
        Libro[] arrayLibros = {donQuijote, celestina};
        Inventario inventario1 = new Inventario(arrayLibros);
        
        // Probar función agregarLibro()
        inventario1.agregarLibro(new Libro("Lazarillo de Tormes", 
                "ISBN003", 635, 15.99));
        
        // Probar función buscarLibroPorIsbn()
        System.out.println("Libro con ISBN001:\n" + inventario1.buscarLibroPorIsbn("ISBN001"));
        
        
        // Probar función prestarLibro()
        inventario1.prestarLibro(donQuijote);
        
        // Probar función devolverLibro()
        inventario1.devolverLibro(donQuijote);
        
    } // end main
} // end class
