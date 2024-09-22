package mx.unam.ciencias.modelado.practica3.factory.componentes.motherboard;

import mx.unam.ciencias.modelado.practica3.factory.componentes.Componente;

/**Interfaz para el componente MotherBoard*/
public interface Motherboard extends Componente{

    /**
     * Método para obtener el tipo de socket de la motherboard
     * @return una cadena que representa el socket de la motherboard
     */
    public String getSocket();
}