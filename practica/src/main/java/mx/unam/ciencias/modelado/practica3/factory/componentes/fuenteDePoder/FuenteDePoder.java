package mx.unam.ciencias.modelado.practica3.factory.componentes.fuenteDePoder;

import mx.unam.ciencias.modelado.practica3.factory.componentes.Componente;

/**Interfaz para el componente CPU*/
public interface FuenteDePoder extends Componente{

    /**
     * Método para obtener la potencia en watts de la fuente de poder
     * @return un entero que representa la capacidad de la fuente.
     */
    public int getPotencia();
}