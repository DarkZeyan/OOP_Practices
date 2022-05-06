/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_3_herencia3;

/**
 *
 * @author user
 */
public class EVA2_3_HERENCIA3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Animal animal = new Animal();
//        animal.mover();
//        
//        Vertebrado v1 = new Vertebrado();
//        v1.mover();
//        v1.tenerEsqueleto();
//        Mamifero m1  = new Mamifero();
//        m1.tenerPelaje();
//        Primate p1 =  new Primate();
//        p1.agarrarObjetos();
          Humano h1 = new Humano();
          h1.pensar();
    }
    
}

class Humano extends Primate{
    public Humano(){
        super();
        System.out.println("HUMANO");
    }
    public void pensar(){
        System.out.println("Pensar");
    }
}

class Primate extends Mamifero{
    public Primate(){
        super();
        System.out.println("PRIMATE");
    }
    public void agarrarObjetos(){
        System.out.println("Sujetar objetos");
    }
}


class Mamifero extends Vertebrado{
    public Mamifero(){
        super();
        System.out.println("MAMIFERO");
    }
    public void tenerPelaje(){
        System.out.println("MAMIFERO: Tiene pelaje");
    }
}


class Vertebrado extends Animal{
    public Vertebrado(){
        super();
        System.out.println("VERTEBRADO");
    }
    public void tenerEsqueleto(){
        System.out.println("VERTEBRADO: Tiene esqueleto");
    }
}


class Animal{
    
    public Animal(){
        System.out.println("ANIMAL");
    }
    
    public void mover(){
        System.out.println("ANIMAL: movimiento");
    }
}