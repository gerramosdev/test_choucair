package german.ramos.perez.orange.utils;

import java.nio.file.Path;
import java.nio.file.Paths;

public class MetodosUtilitarios {

    public static String rutaArchivo() {
        String nombreArchivo = "prueba.txt";
        String directorioActual = System.getProperty("user.dir");
        Path rutaRelativa = Paths.get(directorioActual, nombreArchivo);
        String rutaCompleta = rutaRelativa.toString();
        return rutaCompleta;
    }
}
