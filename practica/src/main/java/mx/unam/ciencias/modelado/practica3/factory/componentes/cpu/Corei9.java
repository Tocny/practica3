package mx.unam.ciencias.modelado.practica3.factory.componentes.cpu;
/**
 * Procesador concreto de la marca Intel.
 */
public class Corei9 implements CPU{
    /** Nombre del procesador */ 
    private String nombre = "Core i9";
    /** Marca del procesador */ 
    private String marca = "Intel";
    /** Numero de nucleos */ 
    private int numeroDeNucleos = 24;
    /** Costo */ 
    private double costo = 7150;

    /**
     * Getter del nombre del procesador.
     * @return nombre
     */
    @Override public String getNombre() {
        return nombre;
    }

    /**
     * Getter del nombre del marca.
     * @return marca
     */
    @Override public String getMarca() {
        return marca;
    }

    /**
     * Getter del numero de nucleos.
     * @return numeroDeNucleos
     */
    @Override public int getNumeroDeNucleos() {
        return numeroDeNucleos;
    }

    /**
     * Getter del costo del procesador.
     * @return costo
     */
    @Override public double getCosto() {
        return costo;
    }

    /**
     * Método que brinda información del componente.
     * @return una cadena que cuenta con las características del componente.
     */
    @Override public String descripcion() {
        return String.format("%s %s de %d núcleos ($%.2f)", 
            getMarca(), getNombre(), getNumeroDeNucleos(), getCosto());
    }
}
