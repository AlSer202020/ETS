/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exepciones;

import java.util.Scanner;

/**
 *
 * @author Daw1
 */
public class ProcesadorDatos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un número: ");;
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(number);
    } // end main
} // end class
