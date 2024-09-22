package mx.unam.ciencias.modelado.practica3.builder;

/**
 * Interfaz para los constructores de computadoras.
 */
public interface PCBuilder{

    /**Método para instalar (construir) el procesador */
    public void instalaCPU();

    /**Método para instalar (construir) la tarjeta gráfica. */
    public void instalaGPU();

    /**Método para instalar (construir) la memoria ram. */
    public void instalaRAM();

    /**Método para instalar (construir) el disco duro. */
    public void instalaDiscoDuro();

    /**Método para instalar (construir) la tarjeta madre. */
    public void instalaMotherboard();

    /**Método para instalar (construir) la fuente de poder. */
    public void instalaFuenteDePoder();

    /**
     * Getter de la computadora.
     * @return una instancia de PC
     */
    public PC getPC();

}