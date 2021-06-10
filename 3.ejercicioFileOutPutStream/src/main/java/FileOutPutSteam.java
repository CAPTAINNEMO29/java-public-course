
import java.io.*;

public class FileOutPutSteam {

    static FileOutputStream fescritura;

    public static void main(String[] args) {

        String nombre = "prueba de escritura";

        File ruta = new File("C:\\Users\\usuario\\Documents\\curso de java online sepe\\unidad 1 clase file\\ejercicios");
        File carpeta = new File(ruta, "prueba");

        try {

            if (!carpeta.exists()) {

                carpeta.mkdir();

            }

            File archivo = new File(carpeta, "listaNombres.dat");

            fescritura = new FileOutputStream(archivo);

        } catch (IOException ioe) {

            System.out.println("ERROR GRAVE EN EL SISTEMA DE E/S EN EL ACCESO");

        }

        try {

            fescritura.write(nombre.getBytes(), 0, nombre.length());

            System.out.println("SE HA ESCRITO EN EL FICHERO");

        } catch (IOException ioe) {

            System.out.println("ERROR DE ENTRADA SALIDA DE DATOS");

        } finally {

            if (fescritura != null) {

                try {

                    fescritura.close();

                } catch (IOException ioe) {

                    System.out.println("ERROR GRAVE DE E/S DE DATOS");

                }

            }

        }
    }
}
