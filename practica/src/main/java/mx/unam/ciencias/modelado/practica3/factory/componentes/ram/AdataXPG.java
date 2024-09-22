package mx.unam.ciencias.modelado.practica3.factory.componentes.ram;
/**
 * Ram concreta para el procesador.
 */
public class AdataXPG implements RAM{
    /** Nombre de la ram */ 
    private String nombre = "XPG";
    /** Marca de la ram */ 
    private String marca = "Adata";
    /** Nombre del socket */ 
    private int capacidad = 16;
    /** Costo */ 
    private double costo = 1300;

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
     * Getter de la capacidad.
     * @return capacidad
     */
    @Override public int getCapacidad() {
        return capacidad;
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
        return String.format("%s %s de %d GB ($%.2f)", 
                getMarca(), getNombre(), getCapacidad(), getCosto());
    }
}
