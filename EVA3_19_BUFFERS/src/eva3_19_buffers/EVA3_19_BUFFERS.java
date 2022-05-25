package eva3_19_buffers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jorge Bugarini
 */
public class EVA3_19_BUFFERS {

    /**
      Archivo  > InputStream > InputStreamReader > BufferedReader > Programa
     */
    public static void main(String[] args)  {
        
        //Definir ruta, abrir archivo, leer archivo y convertir bytes a char.
        // URL → Uniform Resource Locator 
        //URI → Uniform Resource Identificator: Protocolo:ubicacion
        
            Path route = Paths.get("src/Archivos/file.txt");
        
        //2. Abrir el archivo
            InputStream openFile;
            //Para escribir se usa OutputStream {varName};
            
            
        //3. Leer el archivo.
            InputStreamReader readFile;
        //4. Conversion de bytes a char
            BufferedReader readText;
            
        try {
            openFile = Files.newInputStream(route);
            readFile = new InputStreamReader(openFile);
            readText = new BufferedReader(readFile);
            String linea = readText.readLine();
            while(linea!=null){
                
                System.out.println(linea);
                linea = readText.readLine();
        }
        } catch (IOException ex) {
           ex.printStackTrace();
        }
            
            
    }
    
}
