
import java.util.Scanner;

public class ClasePrueba {

    public static void main(String[] args) {
        String texto;
        // Declaración e inicialización de la instancia de la clase Scanner.
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca un texto: ");
        texto = entrada.next();
        System.out.println("Texto introducido: " + texto);
    }
}
