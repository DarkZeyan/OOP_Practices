package eva3_13_mejorar_capturar_edad;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Jorge Bugarini
 */
public class EVA3_13_MEJORAR_CAPTURAR_EDAD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner zeyan = new Scanner(System.in);

        int edad=0;
        boolean flag = true;
        do {
            try {
                System.out.println("Introduce tu edad (entero)");
                edad = zeyan.nextInt();
                if (edad < 0) {
                    throw new Exception("Edad en intervalo inválido");
                }
                System.out.println("Tu edad es: " + edad);
                flag = false;
            } catch (InputMismatchException e) {

                System.out.println(zeyan.next() + " Dato introducido es incompatible, no es entero.");
            } catch (Exception e) {
                
                System.out.println(edad+ " No existen edades negativas");
            }
        } while (flag || edad < 0);

    }

}
