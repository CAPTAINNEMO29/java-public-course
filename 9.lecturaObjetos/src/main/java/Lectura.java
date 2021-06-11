
import java.io.*;

import Utilidades.*;

public class Lectura {

    static ObjectInputStream flujolectura;

    static File archivo;

    public static void main(String args[]) {

        File ruta = new File("C:\\Users\\usuario\\Documents\\curso de java online sepe\\unidad 1 clase file\\ejercicios");
        File carpeta = new File(ruta, "pruebaObjetos");

        archivo = new File(carpeta, "Correos.txt");

        try {

            flujolectura = new ObjectInputStream(new FileInputStream(archivo));

            Persona obj = (Persona) flujolectura.readObject();

            System.out.println("NOMBRE " + obj.Obtener_Nombre() + " APELLIDOS " + obj.Obtener_Apellidos());

            System.out.println("TELEFONO " + obj.Obtener_Telefono() + " EMAIL " + obj.Obtener_Email());

        } catch (ClassNotFoundException e) {

            System.out.println("NO SE HA PODIDO CONVERTIR LA INFORMACION");

        } catch (IOException e) {

            System.out.println("NO SE HA PODIDO LEER LA INFORMACION DEL FICHERO");

        } finally {

            try {

                if (flujolectura != null) {

                    flujolectura.close();

                }

            } catch (IOException e) {

                System.out.println("NO SE HA PODIDO CERRAR CORECTAMENTE EL FLUJO ASOCIADO AL FICHERO");

            }

        }

    }

}
