package mx.unam.ciencias.modelado.practica3.adapter.adapterCPU;
/**
 * Interfaz de los procesadores de AMD.
 */
public interface AMDcpu{
    /**
     * Getter del nombre del procesador.
     * @return nombre
     */
    public String getName();

    /**
     * Getter del nombre del marca.
     * @return marca
     */
    public String getBrand();

    /**
     * Getter del numero de nucleos.
     * @return numeroDeNucleos
     */
    public int getCores();

    /**
     * Getter del costo del procesador.
     * @return costo
     */
    public double getCost();

    /**
     * Devuelve una descripción detallada del procesador.
     * @return Descripción en formato de cadena.
     */
    public String description();
}
