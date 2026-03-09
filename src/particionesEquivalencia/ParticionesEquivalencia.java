/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package particionesEquivalencia;

import java.util.Scanner;

/**
 *
 * @author Alexey
 */
public class ParticionesEquivalencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el alias: ");
        String alias = scanner.nextLine();
        System.out.print("Introduce la edad: ");
        int edad = scanner.nextInt();
        System.out.print("Introduce el número de cuenta: ");
        int nCuenta = scanner.nextInt();
        
        
        System.out.println(ckeckData(edad, nCuenta, alias));
    } // end main
    
    static boolean ckeckData(int edad, int nCuenta, String alias) {
        if (edad < 14 || edad > 100) {
            return false;
        }
        if (nCuenta < 10000000 || nCuenta > 99999999) {
            return false;
        }
        if(alias.length() < 4 || alias.length() > 9) {
            return false;
        }
        for (int i = 0; i < alias.length(); i++) {
            if (alias.charAt(i) == ' ') {
                return false;
            }
        }
        return true;
    }
    
} // end class
