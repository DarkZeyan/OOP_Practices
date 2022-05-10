/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_8_multiples_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Jorge Bugarini
 */
public class EVA3_8_MULTIPLES_CATCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner zeyan = new Scanner(System.in);

        try { // El try es el código que haremos que es posible a susceptir errores
            System.out.println("Introduce entero num1: ");
            int num1 = zeyan.nextInt();
            System.out.println("Introduce entero num2: ");
            int num2 = zeyan.nextInt();
            System.out.println("Division: " + (num1 / num2));
        } catch (ArithmeticException e) { // Los catch son acciones remediales.
            //e.printStackTrace(); // Imprime la excepcion sin detener el flujo del programa.
            System.out.println("Se produjo una división entre cero");
        } catch (InputMismatchException e) {
            System.out.println("Algun dato capturado no es valido.");
        }

        System.out.println("Fin del programa.");
    }
}
