/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_15_throw_persona;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_15_THROW_PERSONA {


    public static void main(String[] args) {

        Persona p = new Persona();
        p.setNombre("Jorge");
        try {
            p.setEdad(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Persona per2 = new Persona("Jorge", capturarEdad());
            System.out.println("Edad: " + per2.getEdad());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static int capturarEdad() throws Exception{
        Scanner zeyan = new Scanner(System.in);
       
        int edad=0;
        try{
           System.out.println("Introduce tu edad: ");
           edad = zeyan.nextInt();
        }catch(InputMismatchException e){
            throw new Exception("Introduciste un valor no válido (Texto o decimales)");
        }
        return edad;
    }

}

class Persona {

    private String nombre;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, int edad) throws Exception {
        this.nombre = nombre;
        setEdad(edad);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception {
        if (edad >= 0 && edad <= 130) {
            this.edad = edad;
        } else {
            throw new Exception("Edad en un rango inválido");
        }

    }

}