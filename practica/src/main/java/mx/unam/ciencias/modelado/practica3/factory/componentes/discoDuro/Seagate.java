package mx.unam.ciencias.modelado.practica3.factory.componentes.discoDuro;
/**
 * Disco duro especifico para el ordenador.
 */
public class Seagate implements DiscoDuro{
    /** Nombre del disco */ 
    String nombre = "PORTR1";
    /** Marca del disco */
    String marca = "Seagate";
    /** Capacidad del disco */ 
    int capacidad = 960;
    /** Tipo del disco */ 
    String tipoDeDisco= "SDD";
    /** Costo */ 
    double costo = 3900;
    /**
     * Getter del nombre del disco duro.
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Getter del nombre del marca.
     * @return marca
     */
    public String getMarca() {
        return marca;
    }
    /**
     * Getter del la capacidad del disco duro.
     * @return capacidad
     */
    public int getCapacidad() {
        return capacidad;
    }
    /**
     * Getter del tipo de disco.
     * @return tipodeDisco
     */
    public String getTipoDeDisco() {
        return tipoDeDisco;
    }
    /**
     * Getter del costo del disco.
     * @return costo
     */
    public double getCosto() {
        return costo;
    }
}
