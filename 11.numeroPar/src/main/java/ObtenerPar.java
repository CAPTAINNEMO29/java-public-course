
import java.io.*;

public class ObtenerPar {

    public static void main(String[] args) throws IOException {
        String numero;

        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Introduzca número:");

        numero = teclado.readLine();

        int num = Integer.parseInt(numero);
        
        System.out.println("el numero introducido es: " + num);

        int dato = Integer.parseInt(numero);

        if (dato % 2 == 0) {

            System.out.println("El dato " + dato + " es par");

        } else {

            System.out.println("El dato " + dato + " es impar");

        }
    }
}
