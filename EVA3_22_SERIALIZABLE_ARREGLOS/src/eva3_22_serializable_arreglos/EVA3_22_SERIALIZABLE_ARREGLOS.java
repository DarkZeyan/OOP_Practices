package eva3_22_serializable_arreglos;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Jorge Bugarini
 */
public class EVA3_22_SERIALIZABLE_ARREGLOS {

    public static void main(String[] args) {
        
        ArrayList<Persona> listaPersonas = new ArrayList(); //Colecciones → Tipos de datos genéricos-
        
        // Java, listas, arreglos, etc: 0 → n-1
        listaPersonas.add(new Persona("Jorge",19));
        listaPersonas.add(new Persona("Yoyi",19));
        listaPersonas.add(new Persona("Gera",19));
        listaPersonas.add(new Persona("Leo",19));
        listaPersonas.add(new Persona("Tony",19));
        
        escribirObjetos(listaPersonas);
        leerObjetos();
    }
    
    
    public static void escribirObjetos(Object obj) {
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
    
      public static void leerObjetos() {

        try {
            FileInputStream openFile = new FileInputStream("src/archivos/file1.zeyan");
            ObjectInputStream readObject = new ObjectInputStream(openFile);
            
            ArrayList<Persona> lista = (ArrayList)readObject.readObject(); ///Siempre regresa un objeto de la Clase Object
            for(int i=0; i<lista.size();i++){
                System.out.println("Nombre: "+lista.get(i).getNombre()+" | Edad: "+lista.get(i).getEdad());
            }
            
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    
}

class Persona implements Serializable {

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
