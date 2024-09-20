package mx.unam.ciencias.modelado.practica3.factory.fabricas;

/**
 * Clase que representa una fabrica de componentes "Standar".
 */
public class FactoryComponenteStandar implements ComponenteFactory{

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
     * @return una instancia del componente Seagate.
     */
    @Override public Motherboard creaMotherboard(){
        return new MSI();
    }

    /**
     * Implementación del creador de fuente de poder.
     * @return una instancia del componente CorsairCX.
     */
    @Override public FuenteDePoder creaFuenteDepoder(){
        return new CorsairCX();
    }


}