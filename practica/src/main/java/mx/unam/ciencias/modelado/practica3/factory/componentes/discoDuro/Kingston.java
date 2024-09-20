package mx.unam.ciencias.modelado.practica3.factory.componentes.discoDuro;
/**
 * Disco duro especifico para el ordenador.
 */
public class Kingston {
    /** Nombre del disco */ 
    String nombre = "A400";
    /** Marca del disco */ 
    String marca = "Kingston";
    /** Capacidad del disco */ 
    int capacidad = 480;
    /** Tipo del disco */ 
    String tipoDeDisco= "SATA III";
    /** Costo */ 
    double costo = 670;
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
