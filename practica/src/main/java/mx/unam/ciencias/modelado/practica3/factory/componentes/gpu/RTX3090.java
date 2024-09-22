package mx.unam.ciencias.modelado.practica3.factory.componentes.gpu;
/**
 * GPU concreto para la tarjeta madre.
 */
public class RTX3090 implements GPU{
    /** Nombre de la GPU */ 
    private String nombre = "GeForce RTX 3090";
    /** Marca de la GPU */
    private String marca = "NVIDIA";
    /** Numero de nucleos */ 
    private String tipoDeMemoria = "GDDR6X";
    /** Costo */ 
    private double costo = 23520;

    /**
     * Getter del nombre de la GPU.
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
     * Getter del tipo de memoria.
     * @return tipoDeMemoria
     */
    @Override public String getTipoDeMemoria() {
        return tipoDeMemoria;
    }

    /**
     * Getter del costo de la GPU.
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
        return String.format("%s %s con memoria %s ($%.2f)", 
                getMarca(), getNombre(), getTipoDeMemoria(), getCosto());
    }
}
