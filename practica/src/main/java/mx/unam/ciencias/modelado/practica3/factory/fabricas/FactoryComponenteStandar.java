package mx.unam.ciencias.modelado.practica3.factory.fabricas;

import mx.unam.ciencias.modelado.practica3.factory.componentes.cpu.*;
import mx.unam.ciencias.modelado.practica3.factory.componentes.gpu.*;
import mx.unam.ciencias.modelado.practica3.factory.componentes.ram.*;
import mx.unam.ciencias.modelado.practica3.factory.componentes.discoDuro.*;
import mx.unam.ciencias.modelado.practica3.factory.componentes.motherboard.*;
import mx.unam.ciencias.modelado.practica3.factory.componentes.fuenteDePoder.*;

/**
 * Clase que representa una fabrica de componentes "Standar".
 */
public class FactoryComponenteStandar implements ComponenteFactory{

    /**
     * Implementación del creador de CPU
     * @return una instancia del componente Corei7.
     */
    @Override public CPU creaCPU(){
        return new Corei5();
    }
    
    /**
     * Implementación del creador de GPU's.
     * @return una instancia del componente RTX4070.
     */
    @Override public GPU creaGPU(){
        return new RTX4070Ti();
    }

    /**
     * Implementación del creador de memoria ram.
     * @return una instancia del componente KingstonFury.
     */
    @Override public RAM creaRAM(){
        return new KingstonFury();
    }

    /**
     * Implementación del creador de disco duro.
     * @return una instancia del componente Samsung.
     */
    @Override public DiscoDuro creaDiscoDuro(){
        return new Samsung();
    }

    /**
     * Implementación del creador de motherboard.
     * @return una instancia del componente Motherboard.
     */
    @Override public Motherboard creaMotherboard(){
        return new MSI();
    }

    /**
     * Implementación del creador de fuente de poder.
     * @return una instancia del componente MSIMag.
     */
    @Override public FuenteDePoder creaFuenteDePoder(){
        return new MSIMag();
    }


}