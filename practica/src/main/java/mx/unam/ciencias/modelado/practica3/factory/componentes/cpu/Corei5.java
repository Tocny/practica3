package mx.unam.ciencias.modelado.practica3.factory.componentes.cpu;
/**
 * Procesador concreto de la marca Intel.
 */
public class Corei5 {
    String nombre = "Core i5";
    String marca = "Intel";
    int numeroDeNucleos = 8;
    double costo = 2900;
    /**
     * Getter del nombre del procesador.
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
     * Getter del numero de nucleos.
     * @return numeroDeNucleos
     */
    public int getNumeroDeNucleos() {
        return numeroDeNucleos;
    }
    /**
     * Getter del costo del procesador.
     * @return costo
     */
    public double getCosto() {
        return costo;
    }
}
