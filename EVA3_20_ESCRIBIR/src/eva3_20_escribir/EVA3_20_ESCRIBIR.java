/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_20_escribir;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author invitado
 */
public class EVA3_20_ESCRIBIR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Path route = Paths.get("src/archivos/file2.txt");
        OutputStream openFile;
        OutputStreamWriter writeFile;
        BufferedWriter writeText;
        
        try{
            openFile = Files.newOutputStream(route);
            writeFile  = new OutputStreamWriter(openFile);
            writeText = new BufferedWriter(writeFile);
            
            writeText.write("Hola mundo");
            writeText.newLine();
            writeText.write("Jorge Bugarini ISC-21550317");
            writeText.flush(); // El método flush hace los cambios permanentes
            writeText.close();
            
        }catch(IOException e){
            e.printStackTrace();
            
        }
       
        
    }
    
}
