/**
 *
 * @author Jorge Eduardo Escobar Bugarini
 */
public class EVA1_5_CLASE_COMPUTADORA {
    public static void main(String[] args){
        Computadora compu1 = new Computadora();
        compu1.setCpu("I5-9400F");
        compu1.setGpu("NVIDIA GTX 1660S");
        compu1.setMemoriaRam("16 GB DDR4");
        compu1.setMarca(null);
        compu1.setCapacidadPSU(500);
        compu1.setSistemaOperativo("Windows 10 Pro");
        compu1.setAlmacenamiento("256 GB SSD + 1TB HDD 7200RPM");
        compu1.setPrecio(18700.00);
        
        // Impresion de los datos
        compu1.imprimirDatos();
    }
}

class Computadora{
    //atributos
    
    private String cpu;
    private String gpu;
    private String memoriaRam;
    private String marca;
    private int capacidadPSU; // En watts
    private String sistemaOperativo;
    private String almacenamiento;
    private double precio;
    
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String valor) {
        cpu = valor;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String valor) {
        gpu = valor;
    }

    public String getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(String valor) {
        memoriaRam = valor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String valor) {
        marca = valor;
    }

    public int getCapacidadPSU() {
        return capacidadPSU;
    }

    public void setCapacidadPSU(int valor) {
        capacidadPSU = valor;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String valor) {
        sistemaOperativo = valor;
    }

    public String getAlmacenamiento() {
        return almacenamiento;
    }
    public void setAlmacenamiento(String valor) {
        almacenamiento = valor;
    }
    
    public void setPrecio(double valor){
        precio=valor;
    }
    public double getPrecio(){
        return precio;
    }
    public double getIVA(){
        return precio*.16;
    }
    public double getPrecioTotal(){
        return precio+precio*.16;
    }
    public void imprimirDatos(){
        System.out.println("Procesador: "+getCpu());
        System.out.println("Tarjeta Grafica: "+getGpu());
        System.out.println("Memoria RAM: "+getMemoriaRam());
        System.out.println("Marca: "+getMarca());
        System.out.println("Capacidad de la PSU: "+getCapacidadPSU());
        System.out.println("Sistema Operativo: "+getSistemaOperativo());
        System.out.println("Capacidad de Almacenamiento: "+getAlmacenamiento());
        System.out.println("Precio sin IVA: "+getPrecio());
        System.out.println("IVA: "+getIVA());
        System.out.println("Precio Total: "+getPrecioTotal());
    }

    
}