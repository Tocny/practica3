package mx.unam.ciencias.modelado.practica3.adapter.adapterGPU;
/**
 * Interfaz para las tarjetas gráficas de amd
 */
public interface AMDgpu{
    /**
     * Getter del nombre de la GPU.
     * @return name
     */
    public String getName();
    /**
     * Getter del nombre del marca.
     * @return brand
     */
    public String getBrand();
    /**
     * Getter del tipo de memoria.
     * @return memoryType
     */
    public String getMemoryType();

    /**
     * Getter del costo de la GPU.
     * @return cost
     */
    public double getCost();

    /**
     * Getter de la descripcion de la GPU.
     * @return description
     */
    public String description();
}


