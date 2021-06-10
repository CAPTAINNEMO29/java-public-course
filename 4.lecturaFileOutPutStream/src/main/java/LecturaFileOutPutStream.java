
import java.io.*;

public class LecturaFileOutPutStream {

    static FileInputStream flectura;

    static File archivo;

    public static void main(String[] args) {
        try {
            File ruta = new File("C:\\Users\\usuario\\Documents\\curso de java online sepe\\unidad 1 clase file\\ejercicios\\prueba");

            archivo = new File(ruta, "listaNombres.dat");

            flectura = new FileInputStream(archivo);

        } catch (FileNotFoundException e) {

            System.out.println("ERROR GRAVE: El fichero " + archivo.getAbsolutePath()
                    + " no está disponible");

            return;

        }

        try {

            byte[] matriz = new byte[(byte) archivo.length()];

            int leidos = flectura.read(matriz, 0, matriz.length);

            System.out.println(new String(matriz, 0, leidos));

        } catch (IOException ioe) {

            System.out.println("ERROR DE ENTRADA SALIDA DE DATOS");

        } finally {

            if (flectura != null) {

                try {

                    flectura.close();

                } catch (IOException ioe) {

                    System.out.println("ERROR GRAVE DE E/S DE DATOS");

                }

            }

        }

    }
}
