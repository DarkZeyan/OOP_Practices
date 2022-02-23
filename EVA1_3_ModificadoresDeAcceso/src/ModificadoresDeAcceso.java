/**
 *
 * @author Jorge Eduardo Escobar Bugarini
 */
public class ModificadoresDeAcceso {
    
    public static void main(String[] args){
        Persona p1 = new Persona(); // instanciar
       p1.setId("21550317");
       p1.setNombre("Jorge Bugarini");
       p1.setEdad(18);
       System.out.println("Nombre: " + p1.getNombre() + " # "+p1.getId() +" - "+p1.getEdad()+" años");

       Persona p2 = new Persona(); // instanciar
       p2.setId("21550000");
       p2.setNombre("Ena Gena");
       p2.setEdad(20);
       System.out.println("Nombre: " + p2.getNombre() + " # "+p2.getId() +" - "+p2.getEdad()+" años");
    }
}

class Persona{
    // Atributos → variables.  No es recomendable que sean visibles al exterior, salvo casos especificos. Debe controlarse a traves de metodos.
    private String id;
    private String nombre;
   private int edad;
    //Comportamiento → metodos
    
      public String getId(){
        return id;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setId(String valor){
        id = valor;
    }
    
    public void setNombre(String valor){
        nombre = valor;
    }
    public void setEdad(int valor){
        edad = valor;
    }
    
}