
import java.io.File;
import java.io.IOException;

public class FileExcersice {

    public static void main(String[] args) throws IOException {
        // establecer la ruta para agregar ficheros
        File ruta = new File("C:\\Users\\usuario\\Documents\\curso de java online sepe\\unidad 1 clase file\\ejercicios");
        // establecer el nombre del fichero a crear
        File f = new File(ruta, "datos.txt");
        File f1 = new File(ruta, "datosNuevos.txt");
        // imprimir la ruta absoluta del archivo
        System.out.println(f.getAbsolutePath());
        // Devuelve un String conteniendo el directorio padre del File. Devuelve null si no tiene directorio padre. del archivo
        System.out.println(f.getParent());
        // imprimir la ruta absoluta de la ruta del archivo
        System.out.println(ruta.getAbsolutePath());
        // Devuelve un String conteniendo el directorio padre del File. Devuelve null si no tiene directorio padre. de la ruta
        System.out.println(ruta.getParent());
        if (!f.exists()) {  //se comprueba si el fichero existe o no
            System.out.println("Fichero " + f.getName() + " no existe");
            if (!ruta.exists()) {  //se comprueba si la ruta existe o no
                System.out.println("El directorio " + ruta.getName() + " no existe");
                if (ruta.mkdir()) { //se crea la carpeta
                    System.out.println("Directorio creado");
                    if (f.createNewFile()) {  //se crea el fichero.
                        System.out.println("Fichero " + f.getName() + " creado");
                    } else {
                        System.out.println("No se ha podido crear " + f.getName());
                    }
                } else {
                    System.out.println("No se ha podido crear " + ruta.getName());
                }
            } else {  //si la ruta existe creamos el fichero
                if (f.createNewFile()) {
                    System.out.println("Fichero " + f.getName() + " creado");
                } else {
                    System.out.println("No se ha podido crear " + f.getName());
                }
            }
        } else { //el fichero existe. Mostramos el tamaño
            System.out.println("Fichero " + f.getName() + " existe");
            System.out.println("Tamaño " + f.length() + " bytes");
        }

        // mostrar los archivos en esa carpeta
        File f2 = new File(ruta, ".");
        // creamos un array para mostrar todos los archivos en esa ruta
        String[] listaArchivos = f2.list();
        if (!f1.exists()) {  //se comprueba si el fichero existe o no
            System.out.println("Fichero " + f1.getName() + " no existe");
        }
        if (f1.createNewFile()) {  //se crea el fichero. Si se ha creado correctamente
            System.out.println("Fichero " + f1.getName() + " creado");
        } else {
            System.out.println("No se ha podido crear " + f1.getName());
        }
        for (int i = 0; i < listaArchivos.length; i++) {
            System.out.println(listaArchivos[i]);
        }
        // mostrar el numero de archivos en esa carpeta
        String[] elementos = ruta.list();
        System.out.println("La carpeta " + ruta.getAbsolutePath() + " tiene " + elementos.length + " subelementos");
    }
}
