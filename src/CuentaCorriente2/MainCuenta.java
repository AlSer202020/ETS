package CuentaCorriente2;

/**
 *
 * @author Alexey
 */
public class MainCuenta {

    public static void main(String[] args) {
        CuentaCorriente usuario = new CuentaCorriente("12345678Y", "Usuario1", "apellidoUsuario");
        usuario.mostrarInformacion();

        usuario.ingresarDinero(100);
//        usuario.mostrarInformacion();
        System.out.println("---------------------");

        usuario.sacarDinero(10);
        System.out.println("---------------------");
        System.out.println(usuario.toString());
        
    }
}
