/**
 * @author Jorge Eduardo Escobar Bugarini
 */
public class EVA1_2_CLASE_PERSONA {//Declaracion
    
    public static void main(String[] args){
        //Crear un objeto
        //Instanciar → Crear objeto → Dar memoria
        //Declarar                      Construir
        Persona estudiante = new Persona(); //Declarar un identificador (objeto) tipo 
        estudiante.nombre = "Jorge Bugarini";
        estudiante.id="21550317";
        estudiante.edad=19;

        Persona estudiante2 = new Persona();
        estudiante2.nombre="Gerardo";
        estudiante2.id="00553355";
        estudiante2.edad=18;
        
        estudiante.imprimirDatos();
        estudiante2.imprimirDatos();
     
    }
}

//Una clase es un tipo de dato abstracto
class Persona{//declaracion
    //Implementacion
    // Atributos de la clase
    String id;
    String nombre;
    int edad;
    //Comportamiento
    //metodo imprimir datos → metodo/funcion

    
    void imprimirDatos(){ // No retorna nada por su tipo de funcion.
        System.out.println("El nombre es: "+nombre);   
        System.out.println("Su ID es: "+id);   
        System.out.println("Su edad es: "+edad);  
        //Concateacion = "           "+ int/float/boolean/string etc → cadena 
        System.out.println("El año de nacimiento es: "+calcularAñoNacimiento());
    }
    
    //calcular año  de nacimiento en base edad
    
    int calcularAñoNacimiento(){
        int añoNac= 2022-edad;  
        return añoNac;
    }
    
}
/*
Persona:
Datos → Atributos
ID: cadena
nombre: cadena
edad: entero
curp: cadena
estatura: real
direccion: cadena
telefono: cadena


Acciones  → metodos
capturarDatos()
consultarDatos()
*/