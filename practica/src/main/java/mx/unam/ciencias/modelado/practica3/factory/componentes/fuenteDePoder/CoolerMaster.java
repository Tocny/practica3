package mx.unam.ciencias.modelado.practica3.factory.componentes.fuenteDePoder;
/**
 * Fuente de poder especifica para el ordenador.
 */
public class CoolerMaster implements FuenteDePoder{
    /** Nombre de la fuente */ 
    private String nombre = "Gold850";
    /** Marca de la fuente  */ 
    private String marca = "Cooler Master";
    /** Potencia de la fuente */ 
    private int potencia = 850;
    /** Costo */ 
    private double costo = 2400;

    /**
     * Getter del nombre.
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
     * Getter de la potencia.
     * @return potencia
     */
    @Override public int getPotencia() {
        return potencia;
    }
    /**
     * Getter del costo.
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
        return String.format("%s %s de %dW ($%.2f)", 
                getMarca(), getNombre(), getPotencia(), getCosto());
    }
}
