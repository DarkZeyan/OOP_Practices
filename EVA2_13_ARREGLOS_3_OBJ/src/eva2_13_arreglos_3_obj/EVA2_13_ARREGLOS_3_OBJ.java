package eva2_13_arreglos_3_obj;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class EVA2_13_ARREGLOS_3_OBJ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona[] arregloP = new Persona[10];
        Scanner input = new Scanner(System.in);
        
         //Captura de datos
        for(int i=0; i<10; i++){
            arregloP[i] = new Persona();
             System.out.println("Introduce tu nombre: ");
             arregloP[i].setNombre(input.nextLine());
        }
        for(int i=0; i<10; i++){
             System.out.println("Persona "+(i+1)+" su nombre es: "+arregloP[i].getNombre());

        }   
    }
    
}
class Persona{
    private String nombre;
    public Persona(){
        
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
