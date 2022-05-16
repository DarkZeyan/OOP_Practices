package eva3_14_throw_2;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author invitado
 */
public class EVA3_14_THROW_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Persona p = new Persona();
        p.setNombre("Jorge");
        try {
            p.setEdad(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Persona per2 = new Persona("Jorge",1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}

class Persona{
    private String nombre;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, int edad) throws Exception{
        this.nombre = nombre;
        this.edad = edad;
        
        if(edad>=0 && edad<=130) this.edad=edad;
        else{
            throw new Exception("Edad en rango inválido");
        }
        
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

    public void setEdad(int edad) throws Exception {
        if(edad>=0 && edad<=130){
            this.edad = edad;        
        }else{
            throw new Exception("Edad en un rango inválido");
        }
        
    }
    
    
    
}