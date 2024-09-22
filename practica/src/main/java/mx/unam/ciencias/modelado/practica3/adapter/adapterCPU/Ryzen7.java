package mx.unam.ciencias.modelado.practica3.adapter.adapterCPU;
/**
 * Procesador concreto de la marca AMD.
 */
public class Ryzen7 implements AMDcpu{
    /** Nombre del procesador */ 
    String nombre = "Ryzen 5800X";
    /** Marca del procesador */ 
    String marca = "AMD";
    /** Numero de nucleos */ 
    int numeroDeNucleos = 8;
    /** Costo */ 
    double costo = 3700;

    /**
     * Getter del nombre del procesador.
     * @return nombre
     */
    public String getName() {
        return nombre;
    }

    /**
     * Getter del nombre del marca.
     * @return marca
     */
    public String getBrand() {
        return marca;
    }

    /**
     * Getter del numero de nucleos.
     * @return numeroDeNucleos
     */
    public int getCores() {
        return numeroDeNucleos;
    }

    /**
     * Getter del costo del procesador.
     * @return costo
     */
    public double getCost() {
        return costo;
    }

    /**
     * Devuelve una descripción detallada del procesador.
     * @return Descripción en formato de cadena.
     */
    public String description() {
        return "CPU: " + getName() + " de " + getCores() + " núcleos, marca " + getBrand() + " ($" + String.format("%.2f", getCost()) + ")";
    }
}
