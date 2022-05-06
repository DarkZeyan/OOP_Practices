package eva2_6_herencia_e_interfaces;

/**
 *
 * @author user
 */
public class Estudiante extends Persona implements MuestraDatos{
    private String numeroControl;
    
    public Estudiante(){
        super();
        numeroControl="";
    }

    public Estudiante(String numeroControl, String nombre, int edad) {
        super(nombre, edad);
        this.numeroControl = numeroControl;
    }

    public String getNumeroControl() {
        return numeroControl;
    }

    public void setNumeroControl(String numeroControl) {
        this.numeroControl = numeroControl;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Nombre: "+getNombre());
        System.out.println("Edad: "+getEdad());
        System.out.println("Numero de Control: "+numeroControl);
    }
    
    
    
}
