/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_12_usar_throw;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author invitado
 */
public class EVA3_12_USAR_THROW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        try {
            Scanner zeyan = new Scanner(System.in);
            System.out.println("Introduce tu edad, un numero entero: ");
            int edad = zeyan.nextInt();
            if(edad<0){
                throw new Exception("Edad en intervalo no válido");
            }
            System.out.println("Tu edad es: "+edad);
        } catch (InputMismatchException e) {
            e.printStackTrace();
       } catch (Exception e) {
             e.printStackTrace();
        }
        
        System.out.println("Fin del programa");
    }
    
}
