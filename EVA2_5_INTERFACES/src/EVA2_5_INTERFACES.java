/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class EVA2_5_INTERFACES {
    
    public static void main(String[] args){
        Persona p = new Persona("Jorge",19);
        p.imprimirDatos();
        
        Vehiculo v =  new Vehiculo("Chevrolet","Camaro");
        v.imprimirDatos();
        v.mostrarMensaje();
    }
   
}

class Persona implements MuestraDatos{
    private String nombre;
    private int edad;
    
    public Persona(){
        nombre = "";
        edad = 0;
    }
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
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

    public void setEdad(int edad) {
        this.edad = edad;
    }
    @Override
    public void imprimirDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
    }
}

class Vehiculo implements MuestraDatos, Mensaje{
    private String marca;
    private String modelo;
    
    public Vehiculo(){
        marca = "";
        modelo = "";
    }

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Marca: "+ marca);
        System.out.println("Modelo: "+modelo);
    }

    @Override
    public void mostrarMensaje() {
        System.out.println("Hola mundo");
    }
    
    
   
}

interface MuestraDatos{
    //Solo aceptan metodos publicos
    //Solo acepta declaraciones de metodos → solo acepta metodos abstractos
    public void imprimirDatos();
}

interface Mensaje{
    public void mostrarMensaje();
}