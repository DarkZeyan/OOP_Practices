/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_16_figuras;

/**
 *
 * @author invitado
 */
public class EVA2_16_FIGURAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Circulo circulin = new Circulo(5.0);
        Rectangulo rectangulin = new Rectangulo(5.0,3.0);
        Triangulo triangulin = new Triangulo(10.0,2.0);
        
        
        //Para el polimorfismo verificar la relación IS-A
        imprimirArea(triangulin);
        imprimirArea(circulin);
        imprimirArea(rectangulin);
        
        claseObject(triangulin);
 
    }
    
    public static void imprimirArea(Figura f){
        System.out.println("Area = "+f.calcularArea());
        //RESTAURAR EL OBJETO: 
        //Convertir un tipo de dato a otro → Casting
        
        if(f instanceof Triangulo){
            System.out.println(f.getClass());
         Triangulo trian = (Triangulo)f; //Convertir la figura devuelta a un triangulo
        }
         
    }
    
    
    public static void claseObject(Object o){
        System.out.println(o.getClass());
    }
}
