package mx.unam.ciencias.modelado.practica3.factory.componentes.gpu;

import mx.unam.ciencias.modelado.practica3.factory.componentes.Componente;

/**Interfaz para el componente GPU*/
public interface GPU extends Componente{

    /**
     * Método para obtener el tipo de memoria de la gráfica
     * @return una cadena que representa la memoria del
     */
    public String getTipoDeMemoria();
}