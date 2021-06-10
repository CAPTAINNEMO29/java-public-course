
import java.io.File;
import java.io.IOException;

public class FileExcercise {

    public static void main(String[] args) {
        File ruta = new File("C:\\Users\\usuario\\Documents\\curso de java online sepe\\unidad 1 clase file\\ejercicios");
        File carpeta = new File(ruta, "prueba");
        // aqui comprobamos si no existe
        if (!carpeta.exists()) {
            // en cuyo caso lo crearemos
            carpeta.mkdir();
            System.out.println("carpeta creada");
        } else {
            // si existe la borraremos
            carpeta.delete();
            System.out.println("carpeta borrada");
            if (!carpeta.exists()) {
                // aqui la volveremos a crear
                carpeta.mkdir();
                System.out.println("carpeta creada");
            }
        }
        System.out.println("El directorio " + carpeta.getName() + " existe");
    }
}
