
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class DataStream {

    public static void main(String[] args) throws IOException {

        String separador = File.separator;
        File ruta = new File("C:" + separador + "Users" + separador + "usuario" + separador + "Documents" + separador + "curso de java online sepe" + separador + "unidad 1 clase file" + separador + "ejercicios");
        File archivo = new File(ruta, "archivoPrueba1.txt");

        // escribir en el archivo
        try {
            FileOutputStream fout = new FileOutputStream(archivo);
            String s = "Welcome to dataStream de nuevo";
            //converting string into byte array 
            byte b[] = s.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
        }

        // leer el archivo
        try {
            FileInputStream fin = new FileInputStream(archivo);
            int i = 0;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        File archivo2 = new File(ruta, "archivoPrueba2.txt");
        archivo2.createNewFile();

        // escribir en el archivo con file writer
        try {
            FileWriter fw = new FileWriter(archivo2);
            fw.write("Welcome to javaTpoint with file writer");
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("\nSuccess... with file writer");

        // leer el archivo con file writer
        FileReader fr = new FileReader(archivo2);
        int i;
        while ((i = fr.read()) != -1) {
            System.out.print((char) i);
        }
        fr.close();

        File archivo3 = new File(ruta, "archivoPrueba3.txt");
        archivo3.createNewFile();

        // escribir con data input stream
        try {
            //create FileOutputStream object
            FileOutputStream fos = new FileOutputStream(archivo3);
            /*
       * To create DataOutputStream object from FileOutputStream use,
       * DataOutputStream(OutputStream os) constructor.
       *
             */
            DataOutputStream dos = new DataOutputStream(fos);
            String str = "This string will be written to file as sequence of characters!";
            /*
        * To write a string as a sequence of characters to a file, use
        * void writeChars(String str) method of Java DataOutputStream class.
        *
        * This method writes string as a sequence of characters to underlying output
        * stream.
             */
            dos.writeChars(str);
            dos.flush();
            /*
         * To close DataOutputStream use,
         * void close() method.
         *
             */
            dos.close();
        } catch (IOException e) {
            System.out.println("IOException : " + e);
        }

        FileInputStream input = new FileInputStream(archivo3);
        DataInputStream inst = new DataInputStream(input);
         int count = input.available();
        byte[] ary = new byte[count];
        inst.read(ary);
        System.out.println("");
        for (byte bt : ary) {
            char k = (char) bt;
            System.out.print(k );
        } 
    }
    
}
