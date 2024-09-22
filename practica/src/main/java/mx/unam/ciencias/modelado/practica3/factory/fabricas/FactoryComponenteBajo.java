package mx.unam.ciencias.modelado.practica3.factory.fabricas;

import mx.unam.ciencias.modelado.practica3.factory.componentes.cpu.*;
import mx.unam.ciencias.modelado.practica3.factory.componentes.gpu.*;
import mx.unam.ciencias.modelado.practica3.factory.componentes.ram.*;
import mx.unam.ciencias.modelado.practica3.factory.componentes.discoDuro.*;
import mx.unam.ciencias.modelado.practica3.factory.componentes.motherboard.*;
import mx.unam.ciencias.modelado.practica3.factory.componentes.fuenteDePoder.*;

/**
 * Clase que representa una fabrica de componentes "bajos".
 */
public class FactoryComponenteBajo implements ComponenteFactory{

    /**
     * Implementación del creador de CPU
     * @return una instancia del componente Corei3.
     */
    @Override public CPU creaCPU(){
        return new Corei3();
    }
    
    /**
     * Implementación del creador de GPU's.
     * @return una instancia del componente GTX1030.
     */
    @Override public GPU creaGPU(){
        return new GTX1030();
    }

    /**
     * Implementación del creador de memoria ram.
     * @return una instancia del componente AdataXPG.
     */
    @Override public RAM creaRAM(){
        return new AdataXPG();
    }

    /**
     * Implementación del creador de disco duro.
     * @return una instancia del componente Seagate.
     */
    @Override public DiscoDuro creaDiscoDuro(){
        return new Seagate();
    }

    /**
     * Implementación del creador de motherboard.
     * @return una instancia del componente ASUS.
     */
    @Override public Motherboard creaMotherboard(){
        return new ASUS();
    }

    /**
     * Implementación del creador de fuente de poder.
     * @return una instancia del componente CoolerMaster.
     */
    @Override public FuenteDePoder creaFuenteDePoder(){
        return new CoolerMaster();
    }


}