package mx.unam.ciencias.modelado.practica3.factory.componentes.cpu;
/**
 * Procesador concreto de la marca Intel.
 */
public class Corei5 {
    /** Nombre del procesador */ 
    String nombre = "Core i5";
    /** Marca del procesador */ 
    String marca = "Intel";
    /** Numero de nucleos */ 
    int numeroDeNucleos = 8;
    /** Costo */ 
    double costo = 2900;
    /**
     * Getter del nombre del procesador.
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
     * Getter del numero de nucleos.
     * @return numeroDeNucleos
     */
    public int getNumeroDeNucleos() {
        return numeroDeNucleos;
    }
    /**
     * Getter del costo del procesador.
     * @return costo
     */
    public double getCosto() {
        return costo;
    }
}
