package mx.unam.ciencias.modelado.practica3.factory.componentes.gpu;
/**
 * Procesador concreto de la marca Intel.
 */
public class RTX4070Ti {
    /** Nombre de la GPU */ 
    String nombre = "GeForce RTX 4070Ti";
    /** Marca de la GPU */ 
    String marca = "NVIDIA";
    /** Numero de nucleos */ 
    String tipoDeMemoria = "GDDR6X";
    /** Costo */ 
    double costo = 11500;
    /**
     * Getter del nombre de la GPU.
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
     * Getter del tipo de memoria.
     * @return tipoDeMemoria
     */
    public String getTipoDeMemoria() {
        return tipoDeMemoria;
    }
    /**
     * Getter del costo de la GPU.
     * @return costo
     */
    public double getCosto() {
        return costo;
    }
}
