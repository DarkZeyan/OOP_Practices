
package eva3_16_custom_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
* @author Jorge Bugarini
 */
public class EVA3_16_CUSTOM_EXCEPTIONS {

    public static void main(String[] args) {

        Persona p = new Persona();
       
       
        try {
            Persona per2 = new Persona("Jorge", capturarEdad());
            System.out.println("Edad: " + per2.getEdad());
        } catch (ExcepcionCaptura e) {
            e.printStackTrace();
        }

    }

    public static int capturarEdad() throws ExcepcionCaptura{
        Scanner zeyan = new Scanner(System.in);
       
        int edad=0;
        try{
           System.out.println("Introduce tu edad: ");
           edad = zeyan.nextInt();
        }catch(InputMismatchException e){
            throw new ExcepcionCaptura("Introduciste un valor no válido (Texto o decimales)");
        }
        return edad;
    }

}

class Persona {

    private String nombre;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, int edad) throws ExcepcionCaptura {
        this.nombre = nombre;
        setEdad(edad);

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

    public void setEdad(int edad) throws ExcepcionCaptura {
        if (edad >= 0 && edad <= 130) {
            this.edad = edad;
        } else {
            throw new ExcepcionCaptura("Edad en un rango inválido");
        }

    }

}
//Hereda de Exception
class ExcepcionCaptura extends Exception{

    public ExcepcionCaptura() {
    }

    public ExcepcionCaptura(String message) {
        super(message);
    }
    
}

