package mx.unam.ciencias.modelado.practica3.factory.componentes.fuenteDePoder;
/**
 * Procesador concreto de la marca Intel.
 */
public class MSIMag {
    /** Nombre de la fuente */ 
    String nombre = "Mag650";
    /** Marca de la fuente  */ 
    String marca = "MSI";
    /** Potencia de la fuente */ 
    int potencia = 650;
    /** Costo */ 
    double costo = 1150;
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
