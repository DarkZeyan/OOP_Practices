package eva2_15_final;

/**
 *
 * @author user
 */
public class EVA2_15_FINAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

}
//Como estudiante no permite la herencia, EstudiantePosgrado no es una clase posible.

class EstudiantePosgrado extends Estudiante {

}

final class Estudiante extends Persona {

    private String noCtrl;

    public Estudiante() {
    }

    public Estudiante(String noCtrl) {
        this.noCtrl = noCtrl;
    }

    public Estudiante(String noCtrl, String nombre) {
        super(nombre);
        this.noCtrl = noCtrl;
    }

    public String getNoCtrl() {
        return noCtrl;
    }

    public void setNoCtrl(String noCtrl) {
        this.noCtrl = noCtrl;
    }

}

class Persona {

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
