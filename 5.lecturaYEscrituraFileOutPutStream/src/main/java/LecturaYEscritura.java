
import java.io.*;

public class LecturaYEscritura {

    //Para trabajar con el fichero con el que voy a escribir o del que voy a leer
    static File archivo;
    //Para escribir en el fichero
    static FileOutputStream fescritura;
    //Para leer en el fichero
    static FileInputStream flectura;

    public static void main(String[] args) throws IOException {

        int opc = Integer.MIN_VALUE;

        //para saber cuando hay que añadir o sobreescribir
        boolean agregar = false;

        File ruta = new File("C:\\Users\\usuario\\Documents\\curso de java online sepe\\unidad 1 clase file\\ejercicios\\prueba");

        do {

            System.out.println("----------------------------------------------------");

            System.out.println("\t1.- ESCRITURA EN FICHERO");

            System.out.println("\t2.- LECTURA EN FICHERO");

            System.out.println("\t3.- SALIR");

            System.out.println("----------------------------------------------------\n");

            do {

                System.out.print("Introduce una opción: ");

                opc = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine().trim());

            } while (opc == Integer.MIN_VALUE);

            if (opc == 1) {

                System.out.print("\n INTRODUCE EL NOMBRE DEL FICHERO DONDE ESCRIBIR: ");

                String fichero = new BufferedReader(new InputStreamReader(System.in)).readLine().trim();

                archivo = new File(ruta, "listaNombres.dat");

                if (archivo.exists()) {

                    System.out.println("\n EL FICHERO YA EXISTE. ¿QUIERE SOBREESCRIBIRLO (S)I (N)O?");

                    String resp = new BufferedReader(new InputStreamReader(System.in)).readLine().trim();

                    if (resp.compareToIgnoreCase("S") == 0) {

                        agregar = false;

                    } else {

                        agregar = true;

                    }

                }

                System.out.println("\nINTRODUCE TEXTO EN EL FICHERO:");

                String cadena = new BufferedReader(new InputStreamReader(System.in)).readLine().trim();

                cadena = cadena + "\n";

                byte[] matriz = cadena.getBytes();

                try {

                    fescritura = new FileOutputStream(archivo.getName(), agregar);

                    fescritura.write(matriz, 0, matriz.length);

                } catch (IOException e) {

                    System.out.println("No se ha podido escribir la información en el fichero " + archivo.getName());

                } finally {

                    try {

                        if (fescritura != null) {

                            fescritura.close();

                        }

                    } catch (IOException e) {

                        System.out.println("No se ha podido cerrar correctamente el flujo de escritura asociado al fichero " + archivo.getName());

                    }

                }

            } else if (opc == 2) {

                System.out.print("\nINTRODUCE EL NOMBRE DEL FICHERO A LEER: ");

                String fichero = new BufferedReader(new InputStreamReader(System.in)).readLine().trim();
                
                //Creo un objeto File asociado a ese nombre
                archivo = new File(fichero); 

                byte[] matriz = new byte[(int) archivo.length()];

                try {

                    flectura = new FileInputStream(archivo);

                    int leidos = flectura.read(matriz, 0, matriz.length);

                    System.out.println("\nEL CONTENIDO DEL FICHERO " + archivo.getName() + "\n es: \n");

                    System.out.println(new String(matriz, 0, leidos));

                } catch (FileNotFoundException e) {

                    System.out.println("No se ha podido establecer comunicación con el fichero " + archivo.getName());

                } catch (IOException e) {

                    System.out.println("No se ha podido leer la información del fichero " + archivo.getName());

                } finally {

                    try {

                        if (flectura != null) {

                            flectura.close();

                        }

                    } catch (IOException e) {

                        System.out.println("No se ha podido cerrar correctamente el flujo asociado al fichero " + archivo.getName());

                    }

                }

            }

        } while (opc != 3);
    }
}
