/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_9_memoria_heap;

/**
 *
 * @author user
 */
public class EVA1_9_MEMORIA_HEAP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 15;
        Prueba obj1 = new Prueba();
        Prueba obj2 = new Prueba();
        System.out.println(obj1.valor);
        System.out.println(obj1);
        System.out.println(obj2.valor);
        System.out.println(obj2);
        obj2 = null; // Se llama el garbage collector y se elimina el objeto
        System.out.println(obj2.valor); //El objeto ya no es utilizable porque ya no existe.
        
    }
       
}

class Prueba{
    int valor = 100;
}
