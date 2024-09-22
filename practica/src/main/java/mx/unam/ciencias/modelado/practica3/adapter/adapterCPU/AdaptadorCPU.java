package mx.unam.ciencias.modelado.practica3.adapter.adapterCPU;

import mx.unam.ciencias.modelado.practica3.factory.componentes.cpu.CPU;

/**
 * Esta clase es un adaptador para la CPU
 */
public class AdaptadorCPU implements CPU {
    private Ryzen7 ryzen;

    /**
     * Constructor que recibe un objeto de tipo Ryzen7.
     * @param ryzen El objeto Ryzen7 que será adaptado a la interfaz CPU.
     */
    public AdaptadorCPU(Ryzen7 ryzen) {
        this.ryzen = ryzen;
    }

    /**
     * Obtiene el nombre del procesador.
     * @return getName.
     */
    @Override
    public String getNombre() {
        return ryzen.getName();
    }

    /**
     * Obtiene la marca del procesador.
     * @return getBrand.
     */
    @Override
    public String getMarca() {
        return ryzen.getBrand();
    }

    /**
     * Obtiene el número de núcleos del procesado.
     * @return getCores
     */
    @Override
    public int getNumeroDeNucleos() {
        return ryzen.getCores();
    }

    /**
     * Obtiene el costo del procesador.
     * @return getCost
     */
    @Override
    public double getCosto() {
        return ryzen.getCost();
    }

    /**
     * Devuelve descripción.
     * @return description.
     */
    @Override
    public String descripcion() {
        return ryzen.description();
    }
}