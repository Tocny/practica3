package mx.unam.ciencias.modelado.practica3.factory.componentes.ram;

import mx.unam.ciencias.modelado.practica3.factory.componentes.Componente;

/**Interfaz para el componente RAM*/
public interface RAM extends Componente{

    /**
     * Método para obtener la capacidad de la memoria
     * @return un double que representa la memoria de la ram.
     */
    public int getCapacidad();
}