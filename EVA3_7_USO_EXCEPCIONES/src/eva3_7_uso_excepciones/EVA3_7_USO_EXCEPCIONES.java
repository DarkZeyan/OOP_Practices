package eva3_7_uso_excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Jorge Bugarini
 */
public class EVA3_7_USO_EXCEPCIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner zeyan = new Scanner(System.in);
        
        
        int edad = 0;
        boolean flag = true;
        do {
            try {
                System.out.println("Introduce tu edad (entero)");
                edad = zeyan.nextInt();
                System.out.println("Tu edad es: " + edad);
                flag=false;
            } catch (InputMismatchException e) {                        
                
                System.out.println(zeyan.next()+" Dato introducido es incompatible, no es entero.");
            }
        } while (flag);
       

    }

}
