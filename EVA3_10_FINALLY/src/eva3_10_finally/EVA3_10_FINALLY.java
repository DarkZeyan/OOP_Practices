package eva3_10_finally;

/**
 *
 * @author Jorge Bugarini
 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class EVA3_10_FINALLY {

    /*
     try{
     }catch(){ Depende de que ocurra una excepcion
            
     }finally{ Este código siempre se ejecuta aun así ocurra la excepción o no
            
     }
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try {
            Scanner zeyan = new Scanner(System.in);
            System.out.println("Introduce un dato entero: ");
            int valor = zeyan.nextInt();
            System.out.println("El valor es: "+valor);
        } catch (InputMismatchException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Esta linea siempre se ejecuta");
        }
        System.out.println("Fin del programa");
    }

}
