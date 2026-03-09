package CuentaCorriente2;

import java.util.Scanner;

/**
 *
 * @author Alexey
 */
public class CuentaCorriente {
    String DNI;
    public String nombre; 
    String apellidos;
    private double saldo = 0;
    private String banco = "banco";

    public CuentaCorriente(String DNI, String nombre, String apellido) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellidos = apellido;
    }
    public CuentaCorriente(String DNI, String nombre, String apellido, int saldo) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellidos = apellido;
        this.saldo = saldo;
    }
    
    void sacarDinero(double cantidadSacar) {
        if (cantidadSacar <= saldo) {
            saldo -= cantidadSacar;
            System.out.print("Operaci�n realizada correctamente.\n�Quieres "
                    + "saber el saldo? (si/no): ");
            Scanner scanner = new Scanner(System.in);
            String respuesta = scanner.nextLine();
            if (respuesta.equals("si")) {
                System.out.println("Saldo despues del ingreso: " + saldo);
            }
        } else {
            System.out.println("La operaci�n no se ha podido realizar, "
                    + "saldo insuficiente");

        }
    }
    void ingresarDinero(double cantidadIngresar) {
        saldo += cantidadIngresar;
        final String quieres_saber_el_saldo_sino_ = "�Quieres saber el saldo? (si/no): ";
        System.out.print(quieres_saber_el_saldo_sino_);
        scanner = new Scanner(System.in);
        String respuesta = scanner.nextLine();
        if (respuesta.equals("si")) {
            System.out.println(SALDO_DESPUES_DEL_INGRESO_ + saldo);
        }
    }
    public Scanner scanner;
    public static final String SALDO_DESPUES_DEL_INGRESO_ = "Saldo despues del ingreso: ";
    void mostrarInformacion() {
        methodChanged(); 
    }

    public void methodChanged() {
        System.out.println("\tDatos de la cuenta:\nNombre: " + nombre + "\napellidos: "
                + apellidos + "\nDNI: " + DNI + " saldo: " + saldo);
    }
    
    public String toString() {
        String resultado = "\tDatos de la cuenta:\nNombre: " + nombre + "\napellidos: " 
                + apellidos + "\nDNI: " + DNI + " saldo: " + saldo;
        
        return resultado;
    }

    /**
     * @return the DNI
     */
    public String getDNI() {
        return DNI;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellidos;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellidos = apellido;
    }

    /**
     * @return the banco
     */
    public String getBanco() {
        return banco;
    }

    /**
     * @param banco the banco to set
     */
    public void setBanco(String banco) {
        this.banco = banco;
    }
}
