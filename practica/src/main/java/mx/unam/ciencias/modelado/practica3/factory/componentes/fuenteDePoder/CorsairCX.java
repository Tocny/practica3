package mx.unam.ciencias.modelado.practica3.factory.componentes.fuenteDePoder;
/**
 * Fuente de poder especifica para el ordenador.
 */
public class CorsairCX implements FuenteDePoder{
    /** Nombre de la fuente */ 
    String nombre = "CX750";
    /** Marca de la fuente  */ 
    String marca = "Corsair";
    /** Potencia de la fuente */ 
    int potencia = 750;
    /** Costo */ 
    double costo = 1720;
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
