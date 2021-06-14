
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileResume {

    public static void main(String[] args) throws IOException {

        // leyendo el separador
        String separador = File.separator;
        System.out.println("el separador es: " + separador);

        // establecer rutas
        File ruta1 = new File("C:\\Users\\usuario\\Documents\\curso de java online sepe\\unidad 1 clase file\\ejercicios");
        File ruta2 = new File("C:" + separador + "Users" + separador + "usuario" + separador + "Documents" + separador + "curso de java online sepe" + separador + "unidad 1 clase file" + separador + "ejercicios");
        System.out.println("la ruta sin separador es: " + ruta1);
        System.out.println("la ruta con separador es: " + ruta2);

        // creando carpetas
        File carpeta1 = new File(ruta1, "prueba1");
        System.out.println("Carpeta1 es una carpeta: " + carpeta1.isDirectory() + " no es una carpeta");
        if (!carpeta1.exists()) {
            // con este metodo creamos la carpeta
            carpeta1.mkdir();
            System.out.println("hemos creado la carpeta1: " + carpeta1.isDirectory());
        } else {
            // con este metodo borramos la carpeta
            // carpeta1.delete();
            // System.out.println("hemos borrado la carpeta1");
        }
        System.out.println("La carpeta " + carpeta1.isDirectory() + " existe");

        // creando archivos
        File f1 = new File(ruta2, "archivoPrueba1.txt");
        File f2 = new File(ruta2, "archivoPrueba2.txt");
        System.out.println("el archivoPreuba1 existe: " + f1.exists());
        System.out.println("el archivoPreuba2 existe: " + f2.exists());
        if (!f1.exists()) {
            // con este metodo creamos el archivo
            f1.createNewFile();
            System.out.println("hemos creado el archivoPrueba1");
        } else {
            // f1.delete();
            // System.out.println("hemos borrado el archivoPrueba1");
        }
        System.out.println("el archivoPrueba1 se puede leer: " + f1.canRead());
        System.out.println("el archivoPrueba1 se puede escribir: " + f1.canWrite());

        // mostrar los archivos de la carpeta a donde va la ruta
        File situacion = new File(ruta2, ".");
        String[] listaArchivos = situacion.list();
        System.out.println("que es listaArchivos: " + Arrays.toString(listaArchivos));
        for (int i = 0; i < listaArchivos.length; i++) {
            System.out.println(listaArchivos[i]);
        }
        // mostrar el numero de archivos en esa carpeta
        String[] elementos = ruta2.list();
        System.out.println("La carpeta " + ruta2.getAbsolutePath() + " tiene " + elementos.length + " subelementos");
    }
}
