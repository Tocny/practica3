package mx.unam.ciencias.modelado.practica3.factory.componentes.gpu;

import mx.unam.ciencias.modelado.practica3.factory.componentes.Componente;

/**Interfaz para el componente CPU*/
public interface CPU extends Componente{

    /**
     * Método para obtener el ntipo de memoria de la gráfica
     * @return una cadena que representa la memoria del
     */
    public String getTipoMemoria();
}