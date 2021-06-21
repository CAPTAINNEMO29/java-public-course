
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ClaseScanner {

    public static void main(String[] args) throws IOException {
        String texto;
        // Declaración e inicialización de la instancia de la clase Scanner.
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca un texto: ");
        // con next() solo cogera una palabra sin reconocer los espacio.
        // nextLine() reconocera los espacio en blanco.
        texto = entrada.nextLine();
        System.out.println("Texto introducido: " + texto);

        // usando buffer reader
        String numero;
        BufferedReader entrada2 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduzca número: ");
        numero = entrada2.readLine();
        // buffer reader solo reconoce string por lo que hay que convertir el numero
        int dato = Integer.parseInt(numero);
        if (dato % 2 == 0) {
            System.out.println("El dato " + dato + " es par");
        } else {
            System.out.println("El dato es " + dato + " es impar");
        }

        // lectura de datos con scanner
        String separador = File.separator;
        File ruta = new File("C:" + separador + "Users" + separador + "usuario" + separador + "Documents" + separador + "curso de java online sepe" + separador + "unidad 1 clase file" + separador + "ejercicios");
        File archivo = new File(ruta, "archivoPrueba1.txt");
        
       Scanner sc = new Scanner(archivo);
        while(sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
        sc.close();
    }
}
