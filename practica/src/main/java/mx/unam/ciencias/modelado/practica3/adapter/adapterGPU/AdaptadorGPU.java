package mx.unam.ciencias.modelado.practica3.adapter.adapterGPU;

import mx.unam.ciencias.modelado.practica3.factory.componentes.gpu.GPU;


/**
 * Esta clase es un adaptador para la GPU
 */
public class AdaptadorGPU implements GPU {
    private AMDgpu radeon;

    /**
     * Constructor que asigna el atributo.
     * @param radeon una instancia de RadeonRX7600
     */
    public AdaptadorGPU(AMDgpu radeon) {
        this.radeon = radeon;
    }

    /**
     * Obtiene el nombre de la tarjeta gráfica.
     * @return radeon.getName.
     */
    @Override
    public String getNombre() {
        return radeon.getName();
    }

    /**
     * Obtiene la marca de la tarjeta gráfica.
     * @return radeon.getBrand.
     */
    @Override
    public String getMarca() {
        return radeon.getBrand();
    }

    /**
     * Obtiene el tipo de memoria de la tarjeta gráfica.
     * @return radeon.getMemoryType.
     */
    @Override
    public String getTipoDeMemoria() {
        return radeon.getMemoryType();
    }

    /**
     * Obtiene el costo de la tarjeta gráfica.
     * @return radeon.getCost.
     */
    @Override
    public double getCosto() {
        return radeon.getCost();
    }

    /**
     * Devuelve descripción.
     * @return radeon.description.
     */
    @Override
    public String descripcion() {
        return radeon.description() + "[Con Adaptador]";
    }
}