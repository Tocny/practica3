package mx.unam.ciencias.modelado.practica3.factory.componentes.discoDuro;
/**
 * Disco duro especifico para el ordenador.
 */
public class Samsung implements DiscoDuro{
    /** Nombre del disco */ 
    private String nombre = "870EVO";
    /** Marca del disco */
    private String marca = "Samsung";
    /** Capacidad del disco */ 
    private int capacidad = 250;
    /** Tipo del disco */ 
    private String tipoDeDisco= "SDD";
    /** Costo */ 
    private double costo = 1565;
    /**
     * Getter del nombre del disco duro.
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
     * Getter del la capacidad del disco duro.
     * @return capacidad
     */
    @Override public int getCapacidad() {
        return capacidad;
    }

    /**
     * Getter del tipo de disco.
     * @return tipodeDisco
     */
    @Override public String getTipoDeDisco() {
        return tipoDeDisco;
    }

    /**
     * Getter del costo del disco.
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
        return String.format("%s %s de %d GB (%s) ($%.2f)", 
                getMarca(), getNombre(), getCapacidad(), getTipoDeDisco(), getCosto());
    }
}
