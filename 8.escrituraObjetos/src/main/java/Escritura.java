
import java.io.*;

import Utilidades.*;

class Escritura {

    static ObjectOutputStream flujoescritura;

    static File archivo, carpeta;

    public static void main(String[] args) {

        File ruta = new File("C:\\Users\\usuario\\Documents\\curso de java online sepe\\unidad 1 clase file\\ejercicios");
        File carpeta = new File(ruta, "pruebaObjetos");

        if (!carpeta.exists()) {

            carpeta.mkdir();

        }

        archivo = new File(carpeta, "Correos.txt");

        try {

            flujoescritura = new ObjectOutputStream(new FileOutputStream(archivo));

            flujoescritura.writeObject(new Persona("Pepe", "Salas Pérez", "919622314", "pepeSalas@yahoo.es"));

            System.out.println("SE HA ESCRITO EN EL FICHERO " + archivo);

        } catch (IOException e) {

            System.out.println("NO SE HA PODIDO ESCRIBIR LA INFORMACION EN EL FICHERO " + archivo);

        } finally {

            try {

                if (flujoescritura != null) {

                    flujoescritura.close();

                }

            } catch (IOException e) {

                System.out.println("NO SE HA PODIDO CERRAR CORRECTAMENTE EL FLUJO ASOCIADO AL FICHERO " + archivo);

            }

        }

    }

}
