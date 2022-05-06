/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_10_metodos_abstractos;

/**
 *
 * @author user
 */
public class EVA2_10_METODOS_ABSTRACTOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
// Metodo abstracto es un metodo sin cuerpo, es decir sin implementación  o llaves.

abstract class ClaseAbstracta{
    public void metodoImplementado(){
        
    }
    public abstract void metodoAbstracto();
}

class ImplementaAbstracto extends ClaseAbstracta{

    @Override
    public void metodoAbstracto() {

    }
    
}