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
public class Circulo extends Figura{
    private double radio;

    public Circulo() {
    }
    
    @Override
    public double calcularArea(){
        return Math.PI*Math.pow(radio,2);
    }
    
    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
}
