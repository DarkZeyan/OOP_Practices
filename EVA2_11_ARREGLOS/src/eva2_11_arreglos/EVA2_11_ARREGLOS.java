/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_11_arreglos;

/**
 *
 * @author user
 */
public class EVA2_11_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //ARREGLOS
        //ALMACENAN DATOS DEL MISMO TIPO
        // SE ACCEDEN POR INDICES
        //java → primera posicion 0 y ultima n-1 y son objetos
        
        int[] arreglo =  new int[10];
        arreglo[0] = 10;
        System.out.println("El arreglo[0] es igual a "+arreglo[0]);
        arreglo[1] = 11;
        arreglo[2] = 12;
        arreglo[3] = 13;
        arreglo[4] = 14;
        arreglo[5] = 15;
        arreglo[6] = 16;
        arreglo[7] = 17;
        arreglo[8] = 18;
        arreglo[9] = 19;
        
        String[] cadenas = new String[5];
        cadenas[5] = "Hola Mundo";
        
        Persona[] clasePoo = new Persona[32];
    }
    
}

class Persona{
    private String nombre;
    
    public Persona(){
        
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}