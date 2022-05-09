
package eva3_5_try_catch;

/**
 *
 * @author Jorge Bugarini
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class EVA3_5_TRY_CATCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Excepciones → Objetos, cuando se produce un error se genera un objeto de tipo Exception en el SO
        
        Scanner zeyan = new Scanner(System.in);
        System.out.println("Introduce tu edad");
         int edad=0;
        try{
          edad = zeyan.nextInt(); 
            
        }catch(InputMismatchException e){
            //e.printStackTrace();
            System.out.println("Tipo de dato incompatible");
        }
        System.out.println("Tu edad es: "+edad);
        
        
    }
    
}
