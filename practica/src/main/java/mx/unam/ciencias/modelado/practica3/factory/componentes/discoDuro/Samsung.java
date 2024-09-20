package mx.unam.ciencias.modelado.practica3.factory.componentes.discoDuro;
/**
 * Procesador concreto de la marca Intel.
 */
public class Samsung {
    /** Nombre del disco */ 
    String nombre = "870EVO";
    /** Marca del disco */
    String marca = "Samsung";
    /** Capacidad del disco */ 
    int capacidad = 250;
    /** Tipo del disco */ 
    String tipoDeDisco= "SDD";
    /** Costo */ 
    double costo = 1565;
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
