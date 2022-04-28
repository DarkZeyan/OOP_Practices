/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_19_clases_anonimas;

/**
 *
 * @author invitado
 */
public class EVA2_19_CLASES_ANONIMAS {

    /**
     * @param args the command line arguments
     */
   
    //Una clase anonima en java es una clase sin nombre
    
    public static void main(String[] args) {
     // TODO code application logic here
     //Mensajes mensaje = new Mensaje();
     
     Mensajes mensaje = new Mensajes(){
         @Override
         public void mostrarMensaje() {
             System.out.println("Hola Mundo!");
         }
         
     };
     mensaje.mostrarMensaje();
     
    }
    
}


interface Mensajes{
    public void mostrarMensaje();
}