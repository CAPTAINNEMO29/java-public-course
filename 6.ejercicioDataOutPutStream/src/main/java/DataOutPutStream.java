
import java.io.*;

public class DataOutPutStream {

    static File archivoPrueba;
    
    static FileOutputStream fescritura;

    static DataOutputStream flujoescritura;

    public static void main(String[] args) throws FileNotFoundException {

        File ruta = new File("C:\\Users\\usuario\\Documents\\curso de java online sepe\\unidad 1 clase file\\ejercicios");
        File carpeta = new File(ruta, "pruebaDataOutPut");
        // aqui comprobamos si no existe
        if (!carpeta.exists()) {
            // en cuyo caso lo crearemos
            carpeta.mkdir();
            System.out.println("carpeta creada");
        } else {
            // si existe la borraremos
            // carpeta.delete();
            // System.out.println("carpeta borrada");
            carpeta.mkdir();
            System.out.println("carpeta creada");
        }
        System.out.println("El directorio " + carpeta.getName() + " existe");
        
        File archivo = new File(carpeta, "listaNombres.dat");

        // File archivoNuevo;
        // archivoNuevo = new File(carpeta, "listaDataOut.dat");
        
        fescritura = new FileOutputStream(archivo);

        String respuesta = "";

        System.out.println("INTRODUCE EL FICHERO DE CLAVES POR TECLADO");

        try {

            String fichero = new BufferedReader(new InputStreamReader(System.in)).readLine().trim();

            if (archivo.exists()) {

                System.out.println("EL FICHERO YA EXISTE ¿DESEA SOBREESCRIBIR (SI/NO)?");

                respuesta = new BufferedReader(new InputStreamReader(System.in)).readLine().trim();

            }

            //compareToIgnoreCase es que compare sin distinguir mayúsculas y minúsculas
            if (respuesta.compareToIgnoreCase("si") == 0) {

                flujoescritura = new DataOutputStream(new FileOutputStream(fichero));

            } else {

                flujoescritura = new DataOutputStream(new FileOutputStream(fichero, true));

            }

            System.out.println("INTRODUCE EL NOMBRE DE USUARIO POR TECLADO: ");

            String nombre = new BufferedReader(new InputStreamReader(System.in)).readLine().trim();

            System.out.println("INTRODUCE EL CODIGO DE USUARIO POR TECLADO: ");

            int codigo = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine().trim());

            flujoescritura.writeInt(codigo);

            flujoescritura.writeUTF(nombre);

        } catch (IOException ioe) {

            System.out.println("NO SE HA PODIDO ESCRIBIR LA INFORMACION EN EL FICHERO " + archivo.getName());

        } finally {

            try {

                if (flujoescritura != null) {

                    flujoescritura.close();

                }

            } catch (IOException ioe) {

                System.out.println("NO SE HA PODIDO CERRAR CORRECTAMENTE EL FLUJO DEL FICHERO EL FICHERO " + archivo.getName());

            }

        }

    }
}
