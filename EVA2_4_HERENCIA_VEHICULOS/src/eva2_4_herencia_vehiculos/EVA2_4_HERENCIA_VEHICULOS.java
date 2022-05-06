package eva2_4_herencia_vehiculos;
/**
 *
 * @author user
 */
public class EVA2_4_HERENCIA_VEHICULOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

class Vehiculo{
    private String tipoCombustible;
    private int numeroLlantas;
    private double capacidadMotor;
    private int cilindrosMotor;
    private int numeroPasajeros;
    private String marca;
    private String modelo;
    private int año;
    
    public Vehiculo(){
        tipoCombustible = "";
        numeroLlantas = 0;
        capacidadMotor = 0.0;
        cilindrosMotor = 0;
        numeroPasajeros = 0;
        marca = "";
        modelo = "";
        año = 0;        
    }

    public Vehiculo(String tipoCombustible, int numeroLlantas, double capacidadMotor, int cilindrosMotor, int numeroPasajeros, String marca, String modelo, int año) {
        this.tipoCombustible = tipoCombustible;
        this.numeroLlantas = numeroLlantas;
        this.capacidadMotor = capacidadMotor;
        this.cilindrosMotor = cilindrosMotor;
        this.numeroPasajeros = numeroPasajeros;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }
    
    public void imprimirDatos(){
        System.out.println("Tipo de Combustible: "+ tipoCombustible);
        System.out.println("Numero de llantas: "+numeroLlantas);
        System.out.println("Capacidad de litros del motor: "+capacidadMotor);
        System.out.println("Cilindros del motor"+cilindrosMotor);
        System.out.println("Numeros de pasajeros permitido: "+numeroPasajeros);
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Año: "+año);
    }
    
    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public int getNumeroLlantas() {
        return numeroLlantas;
    }

    public void setNumeroLlantas(int numeroLlantas) {
        this.numeroLlantas = numeroLlantas;
    }

    public double getCapacidadMotor() {
        return capacidadMotor;
    }

    public void setCapacidadMotor(double capacidadMotor) {
        this.capacidadMotor = capacidadMotor;
    }

    public int getCilindrosMotor() {
        return cilindrosMotor;
    }

    public void setCilindrosMotor(int cilindrosMotor) {
        this.cilindrosMotor = cilindrosMotor;
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
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

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
}

class Motocicleta extends Vehiculo{
    private String tipoMotocicleta;
    private String tipoTransmision;
    private String tipoCamino;
    private String tipoSuspension;
    
    public Motocicleta(){
        super();
        tipoMotocicleta = "";
        tipoTransmision = "";
        tipoCamino = "";
        tipoSuspension = "";
    }

    public Motocicleta(String tipoMotocicleta, String tipoTransmision, String tipoCamino, String tipoSuspension, String tipoCombustible, int numeroLlantas, 
               double capacidadMotor, int cilindrosMotor, int numeroPasajeros, String marca, String modelo, int año) {
                    super(tipoCombustible, numeroLlantas, capacidadMotor, cilindrosMotor, numeroPasajeros, marca, modelo, año);
                    this.tipoMotocicleta = tipoMotocicleta;
                    this.tipoTransmision = tipoTransmision;
                    this.tipoCamino = tipoCamino;
                    this.tipoSuspension = tipoSuspension;
    }

    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Tipo de motocicleta: "+tipoMotocicleta);
        System.out.println("Tipo de transmision: "+tipoTransmision);
        System.out.println("Tipo de camino: "+tipoCamino);
        System.out.println("Tipo de suspension: "+tipoSuspension);
    }
    
    public String getTipoMotocicleta() {
        return tipoMotocicleta;
    }

    public void setTipoMotocicleta(String tipoMotocicleta) {
        this.tipoMotocicleta = tipoMotocicleta;
    }

    public String getTipoTransmision() {
        return tipoTransmision;
    }

    public void setTipoTransmision(String tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }

    public String getTipoCamino() {
        return tipoCamino;
    }

    public void setTipoCamino(String tipoCamino) {
        this.tipoCamino = tipoCamino;
    }

    public String getTipoSuspension() {
        return tipoSuspension;
    }

    public void setTipoSuspension(String tipoSuspension) {
        this.tipoSuspension = tipoSuspension;
    }
    
}

class Automovil extends Vehiculo{
    private String tipoVehiculo;
    private String equipamiento;
    private String tipoTransmision;
    
    public Automovil(){
        super();
        tipoVehiculo = "";
        equipamiento = "";
        tipoTransmision = "";   
    }

    public Automovil(String tipoVehiculo, String equipamiento, String tipoTransmision, String tipoCombustible, int numeroLlantas, 
            double capacidadMotor, int cilindrosMotor, int numeroPasajeros, String marca, String modelo, int año) {
                super(tipoCombustible, numeroLlantas, capacidadMotor, cilindrosMotor, numeroPasajeros, marca, modelo, año);
                this.tipoVehiculo = tipoVehiculo;
                this.equipamiento = equipamiento;
                this.tipoTransmision = tipoTransmision;
    }
    
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Tipo de vehiculo: "+tipoVehiculo);
        System.out.println("Equipamiento: "+equipamiento);
        System.out.println("Tipo de Transmision: "+tipoTransmision);
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getEquipamiento() {
        return equipamiento;
    }

    public void setEquipamiento(String equipamiento) {
        this.equipamiento = equipamiento;
    }

    public String getTipoTransmision() {
        return tipoTransmision;
    }

    public void setTipoTransmision(String tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }
    
}

class Camioneta extends Vehiculo{
    private double capacidadCarga;
    private String tipoConduccion;
    private String tipoNeumaticos;
    
    public Camioneta() {
        super();
        capacidadCarga = 0.0;
        tipoConduccion = "";
        tipoNeumaticos = "";
    }

    public Camioneta(double capacidadCarga, String tipoConduccion, String tipoNeumaticos, String tipoCombustible, int numeroLlantas,
            double capacidadMotor, int cilindrosMotor, int numeroPasajeros, String marca, String modelo, int año) {
            super(tipoCombustible, numeroLlantas, capacidadMotor, cilindrosMotor, numeroPasajeros, marca, modelo, año);
            this.capacidadCarga = capacidadCarga;
            this.tipoConduccion = tipoConduccion;
            this.tipoNeumaticos = tipoNeumaticos;
    }
    
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Capacidad de carga: "+capacidadCarga);
        System.out.println("Tipo de Conduccion: "+tipoConduccion);
        System.out.println("Tipo de Neumaticos: "+tipoNeumaticos);
    }
    
    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public String getTipoConduccion() {
        return tipoConduccion;
    }

    public void setTipoConduccion(String tipoConduccion) {
        this.tipoConduccion = tipoConduccion;
    }

    public String getTipoNeumaticos() {
        return tipoNeumaticos;
    }

    public void setTipoNeumaticos(String tipoNeumaticos) {
        this.tipoNeumaticos = tipoNeumaticos;
    }

}

class Camion extends Vehiculo{
     private double capacidadCarga;
     private int numeroEjes;
     private String tipoCarga;
     private String tipoCamion;
     
    public Camion(){
        super();
        capacidadCarga = 0.0;
        numeroEjes = 0;
        tipoCarga = "";
        tipoCamion = "";
    }
    
    public Camion(double capacidadCarga, int numeroEjes, String tipoCarga, String tipoCamion, String tipoCombustible, int numeroLlantas, 
            double capacidadMotor, int cilindrosMotor, int numeroPasajeros, String marca, String modelo, int año) {
        super(tipoCombustible, numeroLlantas, capacidadMotor, cilindrosMotor, numeroPasajeros, marca, modelo, año);
        this.capacidadCarga = capacidadCarga;
        this.numeroEjes = numeroEjes;
        this.tipoCarga = tipoCarga;
        this.tipoCamion = tipoCamion;
    }

    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Capacidad de Carga: "+capacidadCarga);
        System.out.println("Numero de Ejes: "+numeroEjes);
        System.out.println("Tipo de Carga: "+tipoCarga);
        System.out.println("Tipo de camión: "+tipoCamion);
    }
    
    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    public String getTipoCarga() {
        return tipoCarga;
    }

    public void setTipoCarga(String tipoCarga) {
        this.tipoCarga = tipoCarga;
    }

    public String getTipoCamion() {
        return tipoCamion;
    }

    public void setTipoCamion(String tipoCamion) {
        this.tipoCamion = tipoCamion;
    }
}