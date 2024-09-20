package mx.unam.ciencias.modelado.practica3.factory.componentes.discoDuro;

import mx.unam.ciencias.modelado.practica3.factory.componentes.Componente;

/**Interfaz para el componente CPU*/
public interface DiscoDuro extends Componente{

    /**
     * Método para obtener la capacidad del disco duro.
     * @return una cadena que representa el almacenamiento.
     */
    public int getCapacidad();

    /**
     * Método para obtener el tipo de disco duro (SSD, HDD).
     * @return una cadena que representa el tipo de disco duro.
     */
    public String getTipoDeDisco();
}