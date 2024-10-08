package mx.unam.ciencias.modelado.practica3.factory.fabricas;

import mx.unam.ciencias.modelado.practica3.factory.componentes.cpu.*;
import mx.unam.ciencias.modelado.practica3.factory.componentes.gpu.*;
import mx.unam.ciencias.modelado.practica3.factory.componentes.ram.*;
import mx.unam.ciencias.modelado.practica3.factory.componentes.discoDuro.*;
import mx.unam.ciencias.modelado.practica3.factory.componentes.motherboard.*;
import mx.unam.ciencias.modelado.practica3.factory.componentes.fuenteDePoder.*;

/**
 * Clase que representa una fabrica de componentes "gamer".
 */
public class FactoryComponenteGamer implements ComponenteFactory{

    /**
     * Implementación del creador de CPU
     * @return una instancia del componente Corei9.
     */
    @Override public CPU creaCPU(){
        return new Corei9();
    }
    
    /**
     * Implementación del creador de GPU's.
     * @return una instancia del componente RTX3090.
     */
    @Override public GPU creaGPU(){
        return new RTX3090();
    }

    /**
     * Implementación del creador de memoria ram.
     * @return una instancia del componente CorsairVengeance.
     */
    @Override public RAM creaRAM(){
        return new CorsairVengeance();
    }

    /**
     * Implementación del creador de disco duro.
     * @return una instancia del componente Kingston.
     */
    @Override public DiscoDuro creaDiscoDuro(){
        return new Kingston();
    }

    /**
     * Implementación del creador de motherboard.
     * @return una instancia del componente Gigabyte.
     */
    @Override public Motherboard creaMotherboard(){
        return new Gigabyte();
    }

    /**
     * Implementación del creador de fuente de poder.
     * @return una instancia del componente CorsairCX.
     */
    @Override public FuenteDePoder creaFuenteDePoder(){
        return new CorsairCX();
    }


}