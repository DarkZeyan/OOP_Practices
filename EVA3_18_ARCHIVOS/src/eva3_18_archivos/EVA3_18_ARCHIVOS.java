

package eva3_18_archivos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author invitado
 */
public class EVA3_18_ARCHIVOS {

    /*
    Archivos -→ Almacenamiento de información, utilizaremos archivos de tipo texto y archivos binarios.
    
    Stream → Torrente → Flujo de bytes
    
    */
    
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            
            //Ruta:
            //FileInputStream funciona para leer los archivos de texto.
            FileInputStream file = new FileInputStream("src/eva3_18_archivos/archivo1.txt");
            int caracter = file.read();
            do{
                
                System.out.print((char)caracter);
                caracter=file.read();
            }
            while(caracter!=-1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("El archivo no existe");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
    
}
