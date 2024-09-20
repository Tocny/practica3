package mx.unam.ciencias.modelado.practica3.factory.componentes.fuenteDePoder;
/**
 * Procesador concreto de la marca Intel.
 */
public class CoolerMaster{
    /** Nombre de la fuente */ 
    String nombre = "Gold850";
    /** Marca de la fuente  */ 
    String marca = "Cooler Master";
    /** Potencia de la fuente */ 
    int potencia = 850;
    /** Costo */ 
    double costo = 2400;
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
     * Getter de la potencia.
     * @return potencia
     */
    public int getPotencia() {
        return potencia;
    }
    /**
     * Getter del costo.
     * @return costo
     */
    public double getCosto() {
        return costo;
    }
}
