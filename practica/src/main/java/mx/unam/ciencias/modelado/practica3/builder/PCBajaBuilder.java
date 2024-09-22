package mx.unam.ciencias.modelado.practica3.builder;

import mx.unam.ciencias.modelado.practica3.factory.fabricas.FactoryComponenteBajo;
import mx.unam.ciencias.modelado.practica3.factory.fabricas.ComponenteFactory;

/**Clase para armar una pc gamer. */
public class PCBajaBuilder implements Builder{

    /**La fabrica de componentes. */
    private ComponenteFactory fabrica;
    /**Una pc. */
    private PC pc;

    /**Constructor de la clase, inicializa atributos. */
    public PCGamerBuilder(){
        fabrica = new FactoryComponenteBajo();
        pc = new PC();
    }

    /**
     * Implementación del método para instalar el procesador.
     * Emplea la fabrica para setear el cpu.
     */
    @Override public void instalaCPU(){
        pc.setCPU(fabrica.creaCPU());
    }

    /**
     * Implementación del método para instalar la tarjeta gráfica.
     * Emplea la fabrica para setear la gpu.
     */
    @Override public void instalaGPU(){
        pc.setGPU(fabrica.creaGPU());
    }

    /**
     * Implementación del método para instalar la tarjeta memoria ram.
     * Emplea la fabrica para setear la ram.
     */    
    @Override public void instalaRAM(){
        pc.setRAM(fabrica.creaRAM());
    }

    /**
     * Implementación del método para instalar el disco duro.
     * Emplea la fabrica para setear el disco duro.
     */
    @Override public void instalaDiscoDuro(){
        pc.setDiscoDuro(fabrica.creaDiscoDuro());
    }

    /**
     * Implementación del método para instalar la tarjeta madre.
     * Emplea la fabrica para setear la motherboard.
     */
    @Override public void instalaMotherboard(){
        pc.setMotherboard(fabrica.creaMotherboard());
    }

    /**
     * Implementación del método para instalar la fuente de poder.
     * Emplea la fabrica para setear la fuente de poder.
     */
    @Override instalaFuenteDePoder(){
        pc.setFuenteDePoder(fabrica.creaFuenteDePoder());
    }

    /**
     * Implementación del método para obtener la pc.
     * @return una instancia de PC.
     */
    @Override public PC getPC(){
        return pc;
    }

}