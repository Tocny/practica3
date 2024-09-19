package mx.unam.ciencias.modelado.practica3.factory.fabricas;

import mx.unam.ciencias.modelado.practica3.factory.componentes.*;

/**
 * Interfaz para todas las posibles fabricas de componentes.
 */
public interface ComponenteFactory{

    /**
     * Método para crear (fabricar) un procesador
     * @return una instancia de CPU.
     */
    public CPU creaCPU();

    /**
     * Método para crear (fabricar) una tarjeta gráfica.
     * @return una instancia de GPU.
     */
    public GPU creaGPU();

    /**
     * Método para crear (fabricar) una memoria RAM.
     * @return una instancia de RAM.
     */
    public RAM creaRAM():

    /**
     * Método para crear (fabricar) un disco duro.
     * @return una instancia de DiscoDuro.
     */
    public DiscoDuro creaDiscoDuro();

    /**
     * Método para crear (fabricar) una motherboard.
     * @return una instancia de Motherboard.
     */
    public MotherBoard creaMotherBoard();

    /**
     * Método para crear (fabricar) una fuente de poder.
     * @return una instancia de FuenteDePoder.
     */
    public FuenteDePoder creaFuenteDePoder();
}