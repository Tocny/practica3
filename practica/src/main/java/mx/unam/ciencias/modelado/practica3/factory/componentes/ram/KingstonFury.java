package mx.unam.ciencias.modelado.practica3.factory.componentes.ram;
/**
 * Ram concreta para el procesador.
 */
public class KingstonFury implements RAM{
    /** Nombre de la ram */ 
    String nombre = "Fury";
    /** Marca de la ram */ 
    String marca = "Kingston";
    /** Nombre del socket */ 
    int capacidad = 32;
    /** Costo */ 
    double costo = 2100;
    /**
     * Getter del nombre.
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
     * Getter de la capacidad.
     * @return capacidad
     */
    public int getCapacidad() {
        return capacidad;
    }
    /**
     * Getter del costo.
     * @return costo
     */
    public double getCosto() {
        return costo;
    }
}
