package mx.unam.ciencias.modelado.practica3.factory.componentes.cpu;

import mx.unam.ciencias.modelado.practica3.factory.componentes.Componente;

/**Interfaz para el componente CPU*/
public interface CPU extends Componente{

    /**
     * Método para obtener el numero de nucleos del procesador.
     * @return un entero que representa el número de nucleos.
     */
    public int getNumeroDeNucleos();
}