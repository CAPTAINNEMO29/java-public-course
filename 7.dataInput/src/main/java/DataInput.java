
import java.io.*;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class DataInput {
    
    static DataOutputStream flujoescritura;

    public static void main(String[] args) throws FileNotFoundException, IOException {

        DataInputStream archivoEscritura;
        archivoEscritura = new DataInputStream(new FileInputStream("C:\\Users\\usuario\\Documents\\curso de java online sepe\\unidad 1 clase file\\ejercicios\\pruebaDataOutPut\\listaNombres.dat"));
        
        System.out.println("INTRODUCE EL NOMBRE DE USUARIO POR TECLADO: ");

        String nombre = new BufferedReader(new InputStreamReader(System.in)).readLine().trim();

        System.out.println("INTRODUCE EL CODIGO DE USUARIO POR TECLADO: ");

        int codigo = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine().trim());

        flujoescritura.writeInt(codigo);

        flujoescritura.writeUTF(nombre);

        DataInputStream archivo;
        archivo = new DataInputStream(new FileInputStream("C:\\Users\\usuario\\Documents\\curso de java online sepe\\unidad 1 clase file\\ejercicios\\pruebaDataOutPut\\listaNombres.dat"));
        while (archivo.available() > 0) {

            System.out.println("CODIGO DE USUARIO: " + archivo.readInt());
            System.out.println("NOMBRE DE USUARIO: " + archivo.readUTF());
        }

        archivo.close();

    }
}
