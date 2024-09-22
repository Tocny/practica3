package mx.unam.ciencias.modelado.practica3.builder;

/**
 * Clase directora para gestionar el armado de una computadora.
 */
public class Director{
    /**Instancia de Builder para armar PC's */
    private Builder constructorPC;

    /**
     * Constructor de la clase, incializa el atributo.
     * @param constructorPC una instancia de Builder par armar la pc.
     */
    public Director(Builder constructorPC){
        this.constructorPC = constructorPC;
    }

    /**Método para armar la pc componente a componente. */
    public void armaPC(){
        constructorPC.instalaCPU();
        constructorPC.instalaGPU();
        constructorPC.instalaRAM();
        constructorPC.instalaDiscoDuro();
        constructorPC.instalaMotherboard();
        constructorPC.instalaFuenteDePoder();
    }

    /**
     * Getter de la computadora del constructor
     * @return la instancia de PC del atributo constructorPC.
     */
    public PC getPC(){
        return constructorPC.getPC();
    }

}