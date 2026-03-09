package refactorizacion;

import java.util.Scanner;

/**
 *
 * @author Alexey
 */
public class Ejemplo_refactor {

    public static void main(String[] args) {
        System.out.println("Introduce un número");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int resultado = n * n;
        System.out.println(resultado);
        
        double precio = 10;
        precio = precio * (1+IGIC);
        
        
        int[] array = {1,2,3,4,5};
        int indice = 7;
        final boolean FueraRango = indice > array.length || indice < 0;
        
        if (FueraRango) {
            System.out.println("Elemento fuera de límites");
        }
        
        for (int i = 0; i < 12; i++) {
            if (FueraRango) {
                break;
            }
        }
    }
    private static final double IGIC = 0.07;
}
