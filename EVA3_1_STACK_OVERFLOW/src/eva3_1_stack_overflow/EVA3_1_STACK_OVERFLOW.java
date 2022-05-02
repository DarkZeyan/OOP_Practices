/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_1_stack_overflow;

/**
 *
 * @author invitado
 */
public class EVA3_1_STACK_OVERFLOW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int x = 0;
        terminarStack(x);
    }
    
    public static void terminarStack(int x){
        x++;
        System.out.println(x);
        terminarStack(x);
        
        
    }
    
}
