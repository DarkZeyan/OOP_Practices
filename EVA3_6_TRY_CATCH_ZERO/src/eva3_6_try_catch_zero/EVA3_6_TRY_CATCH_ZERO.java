/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_6_try_catch_zero;
import java.util.Scanner;
/**
 *
 * @author invitado
 */
public class EVA3_6_TRY_CATCH_ZERO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                
        Scanner zeyan = new Scanner(System.in);
        System.out.println("Introduce entero num1: ");
        int num1 = zeyan.nextInt();
        System.out.println("Introduce entero num2: ");
        int num2 = zeyan.nextInt();
        
        
        try{
            System.out.println("Division: "+(num1/num2));
        }catch(ArithmeticException e){
            //e.printStackTrace(); // Imprime la excepcion sin detener el flujo del programa.
            System.out.println("Se produjo una división entre cero");
        }
        
        System.out.println("Fin del programa.");
    }
    
    
}
