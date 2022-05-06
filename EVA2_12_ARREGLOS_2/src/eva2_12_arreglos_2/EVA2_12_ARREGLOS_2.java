
package eva2_12_arreglos_2;

/**
 *
 * @author user
 */

import java.util.Scanner;

public class EVA2_12_ARREGLOS_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arregloEdades = new int[32];
        Scanner input = new Scanner(System.in);
        
        //32 capturas → for
        //Captura de datos
        for(int i=0; i<32; i++){
             System.out.println("Introduce tu edad: ");
             arregloEdades[i] = input.nextInt();
        }
        
        //mostrar datos
        for(int i=0;i<32;i++){
            System.out.println("Edad "+(i+1)+": "+arregloEdades[i]);
        }
    }
    
}
