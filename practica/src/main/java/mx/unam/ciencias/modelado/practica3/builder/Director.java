package mx.unam.ciencias.modelado.practica3.builder;

/**
 * Clase directora para gestionar el armado de una computadora.
 */
public class Director{
    /**Instancia de Builder para armar PC's */
    private Builder constructorPC;

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

    /**Getter de la pc del constructor de pc's. */
    public PC getPC(){
        return constructorPC.getPC();
    }

}