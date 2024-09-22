package mx.unam.ciencias.modelado.practica3.factory.componentes;

/**
 * Interfaz de componentes, todos estos son métodos comunes que tienen
 * todos los componentes concretos.
 */
public interface Componente{

    /**
     * Getter del nombre del componente.
     * @return una cadena con el nombre.
     */
    public String getNombre();

    /**
     * Getter de la marca del componente.
     * @return una cadena con la marca.
     */
    public String getMarca();

    /**
     * Getter del precio del componente.
     * @return un double con el costo.
     */
    public double getCosto();

    /**
     * Método que brinda información del componente.
     * @return una cadena que cuenta con las caracteristicas del componente.
     */
    public String descripcion();
}