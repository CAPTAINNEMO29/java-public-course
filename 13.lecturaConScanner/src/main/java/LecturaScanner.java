
import java.io.*;
import java.util.Scanner;
import java.io.File;

public class LecturaScanner {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner entrada = new Scanner(System.in);
        // String[] datos = new String[];
        try {
            entrada = new Scanner(new File("C:\\Users\\usuario\\Documents\\curso de java online sepe\\unidad 1 clase file\\ejercicios\\pruebaObjetos\\Correos.txt"));
            while (entrada.hasNextLine()) {
                // String line = entrada.nextLine();
                System.out.println(entrada.nextLine());
            }
            entrada.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        /* otra forma de leerlo
        File file = new File("C:\\Users\\usuario\\Documents\\curso de java online sepe\\unidad 1 clase file\\ejercicios\\pruebaObjetos\\Correos.txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
         */
    }
}
