package eva3_21_serializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jorge Bugarini
 */
public class EVA3_21_SERIALIZABLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Especificar que objetos (clases) son serializables.
        //Debemos hacer que dicha clase implemente la interfaz SERIALIZABLE   
        
        Persona persona = new Persona("Jorge",19);
        escribirObjetos(persona);
        
    }
    public static void escribirObjetos(Object obj){
        try {
            FileOutputStream openFile = new FileOutputStream("src/archivos/file1.zeyan");
            ObjectOutputStream saveObject = new ObjectOutputStream(openFile);
            saveObject.writeObject(obj);
            saveObject.flush();
            saveObject.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    
}

class Persona implements Serializable{
    private String nombre;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}