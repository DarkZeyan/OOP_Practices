/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_10_copia_objetos;

/**
 *
 * @author user
 */
public class EVA1_10_COPIA_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Prueba obj1 = new Prueba();
        System.out.println("Direccion: "+obj1);
        obj1.x = 100;
        System.out.println("Valor de X = "+obj1.x);
        Prueba respaldo = obj1;
        System.out.println("Valor de X en respaldo = "+respaldo.x);
        respaldo.x = 999;
        System.out.println("Obj1 = "+obj1.x);
        System.out.println("Respaldo = "+respaldo.x);
    }
    
}
class Prueba{
    public int x;
}