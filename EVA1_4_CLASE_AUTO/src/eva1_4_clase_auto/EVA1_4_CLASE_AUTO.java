/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_4_clase_auto;

/**
 *
 * @author user
 */
public class EVA1_4_CLASE_AUTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Automovil miAuto = new Automovil();
        miAuto.setMarca("Chevrolet");
        miAuto.setModelo("Camaro");
        miAuto.setTipo("Sedan");
        miAuto.setAño(2022);
        miAuto.setColor("Amarillo");
        miAuto.setPrecio(1152900.0);
        miAuto.imprimirDatos();
    }
    
}

class Automovil{
    private String marca;
    private String modelo;
    private String tipo;
    private int año;
    private String color;
    private double precio;
    
    //metodos
    public void imprimirDatos(){
        System.out.println("Marca: "+getMarca());
        System.out.println("Modelo: "+getModelo());
        System.out.println("Año: "+getAño());    
        System.out.println("Color: "+getColor());
        System.out.println("Tipo de Vehiculo: "+getTipo());
        System.out.println("Precio del Vehiculo: "+getPrecio());
    }

    //Metodos set
      public void setMarca(String valor){
        marca = valor;
    }
     public void setModelo(String valor){
        modelo = valor;
    }
    public void setTipo(String valor){
        tipo = valor;
    }
    public void setColor(String valor){
        color = valor;
    }
    public void setPrecio(double valor){
        precio=valor;
    }
    public void setAño(int valor){
        año = valor;
    }    
    
    //metodos get 
        public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }
    
    public String getTipo(){
        return tipo;
    }

    public int getAño(){
        return año;
    }
  
    public String getColor(){
        return color;
    }

    public double getPrecio(){
        return precio;
    }
    
}
