package mx.unam.ciencias.modelado.practica3.factory.componentes.motherboard;
/**
 * Tarjetas madres especificas para Intel.
 */
public class ASUS implements MotherBoard{
    /** Nombre de la tarjeta madre */ 
    String nombre = "Micro-ATX";
    /** Marca de la tarjeta madre */ 
    String marca = "ASUS";
    /** Nombre del socket */ 
    String socket = "H470";
    /** Costo */ 
    double costo = 4200;
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
     * Getter del socket.
     * @return socket
     */
    public String getSocket() {
        return socket;
    }
    /**
     * Getter del costo.
     * @return costo
     */
    public double getCosto() {
        return costo;
    }
}
