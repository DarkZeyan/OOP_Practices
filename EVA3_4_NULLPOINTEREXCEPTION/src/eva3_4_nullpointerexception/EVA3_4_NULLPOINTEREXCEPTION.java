/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_4_nullpointerexception;

/**
 *
 * @author invitado
 */
public class EVA3_4_NULLPOINTEREXCEPTION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Persona persona = null;
        Persona persona = new Persona("Jorge");
        imprimir(persona);
        System.out.println("Fin de main");
    }
    public static void imprimir(Persona p){
        masComplicado(p);
        System.out.println("Fin de imprimir");
    }
    
    public static void masComplicado(Persona p){
        System.out.println("Nombre: "+ p.getNombre());
        System.out.println("Fin de mas complicado");
    }
}

class Persona{
    private String nombre;
    

    public Persona() {
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