/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadExepciones;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Alexey
 */
public class manejoExepciones {

    public static void main(String[] args) {
        String[] valores = {"15", "20", "0", null, "Hola", "50", ""};
        int opcion = 0;
        while (opcion != 5) {
            System.out.println("\n" + Arrays.toString(valores));
            System.out.println("""
                               
                               Menu: 
                               (1) Modificar valor
                               (2) Mostrar longitud de cadena
                               (3) Calcular división
                               (4) Extraer primera letra
                               (5) Salir
                               """);
            System.out.print("Elige una opción (1-5): ");
            try {
                Scanner scanner = new Scanner(System.in);
                opcion = scanner.nextInt();
                switch (opcion) {

                    case 1 -> {
                        cambiarValor(valores);
                    }
                    case 2 -> {
                        mostrarLongitud(valores);
                    }
                    case 3 -> {
                        calcularDivision(valores);
                    }
                    case 4 -> {
                        mostrarPrimeraLetra(valores);
                    }
                    case 5 -> {
                        System.out.println("Saliendo del programa...");
                    }
                    default -> {
                        System.out.println("Introduce un número del 1 al 5");
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: introduce un número");
            }
        }
    } // end main

    static void cambiarValor(String[] valores) {
        boolean continua;
        do {
            continua = false;
            try {
                System.out.println("\n" + Arrays.toString(valores));
                Scanner scanner = new Scanner(System.in);

                System.out.print("Introduce la posición en la que quiere cambiar el valor (0-6): ");
                int posicion = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Introduce el valor que quiere asignar: ");
                String valor = scanner.nextLine();

                valores[posicion] = valor;
                System.out.println("Valor asignado correctamente.");
            } catch (InputMismatchException e) {
                System.out.println("Error: introduce un número");
                continua = true;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: posición que no existe en el array");
                continua = true;
            }
        } while (continua);
    } // end cambiarValor

    static void mostrarLongitud(String[] valores) {
        boolean continua;
        do {
            continua = false;
            try {
                System.out.println("\n" + Arrays.toString(valores));
                Scanner scanner = new Scanner(System.in);

                System.out.print("Introduce la posición de la que quiere ver la longitud (0-6): ");
                int posicion = scanner.nextInt();
                System.out.println("La longitud es: " + valores[posicion].length());
            } catch (InputMismatchException e) {
                System.out.println("Error: introduce un número");
                continua = true;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: posición que no existe en el array");
                continua = true;
            } catch (NullPointerException e) {
                System.out.println("Error: valor nulo");
                continua = true;
            }
        } while (continua);
    }
    
    static void calcularDivision (String[] valores){
        boolean continua;
        do {
            continua = false;
            try {
                System.out.println("\n" + Arrays.toString(valores));
                Scanner scanner = new Scanner(System.in);

                System.out.print("Introduce la posición que quiere dividir (0-6): ");
                int posicion = scanner.nextInt();
                
                int numero = Integer.parseInt(valores[posicion]);
                
                System.out.print("Introduce el divisor (número entero): ");
                int divisor = scanner.nextInt();
                
                System.out.println("resultado de la división: " + (numero / divisor));
                
            } catch (InputMismatchException e) {
                System.out.println("Error: introduce un número");
                continua = true;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: posición que no existe en el array");
                continua = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: no se puede convertir valor en esta posición a entero");
                continua = true;
            } catch (ArithmeticException e) {
                System.out.println("Error: no se puede dividir emtre 0"); 
                continua = true;
            }
        } while (continua);
    }
    static void mostrarPrimeraLetra (String [] valores) {
        boolean continua;
        do {
            continua = false;
            try {
                System.out.println("\n" + Arrays.toString(valores));
                Scanner scanner = new Scanner(System.in);

                System.out.print("Introduce la posición en la que quere ver el primer caracter (0-6): ");
                int posicion = scanner.nextInt();
                
                System.out.println("Caracter en posición 0: " + valores[posicion].charAt(0));
                
            } catch (InputMismatchException e) {
                System.out.println("Error: introduce un número");
                continua = true;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: posición que no existe en el array");
                continua = true;
            }  catch (NullPointerException e) {
                System.out.println("Error: valor nulo");
                continua = true;
            }
        } while (continua);
    }        
    
} // end class
