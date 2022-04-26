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
        
        imprimirArea(triangulin);
        imprimirArea(circulin);
    
    }
    
    public static void imprimirArea(Figura f){
        System.out.println("Area = "+f.calcularArea());
    }
}