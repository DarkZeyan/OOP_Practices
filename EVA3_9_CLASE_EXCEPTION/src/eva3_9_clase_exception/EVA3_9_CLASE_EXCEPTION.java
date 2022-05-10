/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_9_clase_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_9_CLASE_EXCEPTION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner zeyan = new Scanner(System.in);

        try { // El try es el código que haremos que es posible a susceptir errores
            System.out.println("Introduce entero num1: ");
            int num1 = zeyan.nextInt();
            System.out.println("Introduce entero num2: ");
            int num2 = zeyan.nextInt();
            System.out.println("Division: " + (num1 / num2));
        } catch (Exception e) { // Los catch son acciones remediales.
            e.printStackTrace(); // Imprime la excepcion sin detener el flujo del programa.
            System.out.println("Se produjo un error en la captura o procesamiento de datos");
        }
        System.out.println("Fin del programa.");
    }
    
}
