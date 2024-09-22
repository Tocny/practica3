package mx.unam.ciencias.modelado.practica3.factory.componentes.motherboard;
/**
 * Tarjetas madres especificas para Intel.
 */
public class ASUS implements Motherboard{
    /** Nombre de la tarjeta madre */ 
    private String nombre = "Micro-ATX";
    /** Marca de la tarjeta madre */ 
    private String marca = "ASUS";
    /** Nombre del socket */ 
    private String socket = "H470";
    /** Costo */ 
    private double costo = 4200;

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
     * Getter del socket.
     * @return socket
     */
    @Override public String getSocket() {
        return socket;
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
        return String.format("%s %s con socket %s ($%.2f)", 
                getMarca(), getNombre(), getSocket(), getCosto());
    }
}
