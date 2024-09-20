package mx.unam.ciencias.modelado.practica3.factory.componentes.ram;
/**
 * Ram concreta para el procesador.
 */
public class AdataXPG{
    /** Nombre de la ram */ 
    String nombre = "XPG";
    /** Marca de la ram */ 
    String marca = "Adata";
    /** Nombre del socket */ 
    int capacidad = 16;
    /** Costo */ 
    double costo = 1300;
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
