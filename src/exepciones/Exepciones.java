/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Daw1
 */
public class Exepciones {
    public static void main(String[] args) {
        
        
        int divisor;
        int numerador = 10;
        
        boolean continua;
        do {   
            continua = false;
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Introduc eun divisor: ");
                divisor = scanner.nextInt();
                
                scanner.nextLine();
                System.out.println("Introduce una frase: ");
                String texto = scanner.nextLine();
                
                int resultado = numerador / divisor;
                
                System.out.print("El resultado de la división es: " + resultado);
                System.out.println("La frase es: " + texto);
                
            } catch (ArithmeticException e) { // captura el error
                System.out.println("Ha ocurrido un error: División por cero");
                continua = true;
            } catch (InputMismatchException e) {
                System.out.println("Debes introducir un número entero");
                continua = true;
            }
        } while (continua);
        

    } // end main
} // end class
