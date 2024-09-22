package mx.unam.ciencias.modelado.practica3.builder;

import mx.unam.ciencias.modelado.practica3.common.MetodosGet;
import mx.unam.ciencias.modelado.practica3.factory.fabricas.*;
import mx.unam.ciencias.modelado.practica3.factory.componentes.cpu.*;
import mx.unam.ciencias.modelado.practica3.factory.componentes.gpu.*;
import mx.unam.ciencias.modelado.practica3.factory.componentes.fuenteDePoder.*;
import mx.unam.ciencias.modelado.practica3.factory.componentes.motherboard.*;
import mx.unam.ciencias.modelado.practica3.factory.componentes.discoDuro.*;
import mx.unam.ciencias.modelado.practica3.factory.componentes.ram.*;
import mx.unam.ciencias.modelado.practica3.adapter.adapterCPU.*;
import mx.unam.ciencias.modelado.practica3.adapter.adapterGPU.*;

/**Clase para armar una pc personalizable. */
public class PCPersonalizableBuilder implements Builder{

    /**La fabrica de componentes. */
    private ComponenteFactory fabrica;
    /**Una pc. */
    private PC pc;

    /**Constructor de la clase, inicializa atributos. */
    public PCPersonalizableBuilder(){
        pc = new PC();
    }

    /**
     * Implementación del método para instalar el procesador.
     * Emplea la fabrica para setear el cpu.
     */
    @Override public void instalaCPU(){
        System.out.println("Selecciona el procesador:");
        System.out.println("1. Core i3");
        System.out.println("2. Core i5");
        System.out.println("3. Core i9");
        System.out.println("4. Ryzen 7");

        int opcion = MetodosGet.getInt("Introduzca su elección", "Entrada Inválida", 1, 4);

        switch(opcion){
            case 1:
                fabrica = new FactoryComponenteBajo();
                break;
            case 2:
                fabrica = new FactoryComponenteStandar();
                break;
            case 3:
                fabrica = new FactoryComponenteGamer();
                break;
            case 4:
                boolean eleccion = decidirIncompatible();
                
                if(!eleccion){
                    instalaGPU();
                } else{
                    System.out.println("Se resolverá la incompatibilidad con un adaptador.");
                }
                
                Ryzen7 ryzen = new Ryzen7();
                AdaptadorCPU adaptador = new AdaptadorCPU(ryzen);
                pc.setCPU(adaptador);
                return;
        }

        pc.setCPU(fabrica.creaCPU());
    }

    /**
     * Implementación del método para instalar la tarjeta gráfica.
     * Emplea la fabrica para setear la gpu.
     */
    @Override public void instalaGPU(){
        System.out.println("Selecciona una tarjeta gráfica:");
        System.out.println("1. GTX 1030");
        System.out.println("2. RTX 4070Ti");
        System.out.println("3. RTX 3090");
        System.out.println("4. Radeon RX 7600");

        int opcion = MetodosGet.getInt("Introduzca su elección", "Entrada Inválida", 1, 4);

        switch(opcion){
            case 1:
                fabrica = new FactoryComponenteBajo();
                break;
            case 2:
                fabrica = new FactoryComponenteStandar();
                break;
            case 3:
                fabrica = new FactoryComponenteGamer();
                break;
            case 4:
                boolean eleccion = decidirIncompatible();
                
                if(!eleccion){
                    instalaGPU();
                } else{
                    System.out.println("Se resolverá la incompatibilidad con un adaptador.");
                }

                RadeonRX7600 ryzen = new RadeonRX7600();
                AdaptadorGPU adaptador = new AdaptadorGPU(ryzen);
                pc.setGPU(adaptador);
                
                return;
        }

        pc.setGPU(fabrica.creaGPU());
    }

    /**
     * Método que le permite al usuario decidir entre elegir un componente compatible o no para su computadora.
     * @return si el usuario ha decidido mantener su elección.
     */
    private boolean decidirIncompatible(){
        System.out.println("Posible incompatibilidad, desea cambiar su eleccion?");
        System.out.println("0. Cambiar seleccion.");
        System.out.println("1. Mantener eleccion.");
        return MetodosGet.getInt("Elija: ", "Entrada inválida", 0, 1) == 1;

    }

    /**
     * Implementación del método para instalar la tarjeta memoria ram.
     * Emplea la fabrica para setear la ram.
     */    
    @Override public void instalaRAM(){
        System.out.println("Selecciona una memoria ram:");
        System.out.println("1. Adata XPG");
        System.out.println("2. Kinston Fury");
        System.out.println("3. Corsair Vengeance");

        int opcion = MetodosGet.getInt("Introduzca su elección", "Entrada Inválida", 1, 3);

        switch(opcion){
            case 1:
                fabrica = new FactoryComponenteBajo();
                break;
            case 2:
                fabrica = new FactoryComponenteStandar();
                break;
            case 3:
                fabrica = new FactoryComponenteGamer();
                break;
        }

        pc.setRAM(fabrica.creaRAM());
    }

    /**
     * Implementación del método para instalar el disco duro.
     * Emplea la fabrica para setear el disco duro.
     */
    @Override public void instalaDiscoDuro(){
        System.out.println("Selecciona un disco duro:");
        System.out.println("1. Seagate");
        System.out.println("2. Samsung");
        System.out.println("3. Kingston");

        int opcion = MetodosGet.getInt("Introduzca su elección", "Entrada Inválida", 1, 3);

        switch(opcion){
            case 1:
                fabrica = new FactoryComponenteBajo();
                break;
            case 2:
                fabrica = new FactoryComponenteStandar();
                break;
            case 3:
                fabrica = new FactoryComponenteGamer();
                break;
        }

        pc.setDiscoDuro(fabrica.creaDiscoDuro());
    }

    /**
     * Implementación del método para instalar la tarjeta madre.
     * Emplea la fabrica para setear la motherboard.
     */
    @Override public void instalaMotherboard(){
        System.out.println("Selecciona una tarjeta madre:");
        System.out.println("1. Gigabyte");
        System.out.println("2. MSI");
        System.out.println("3. ASUS");

        int opcion = MetodosGet.getInt("Introduzca su elección", "Entrada Inválida", 1, 3);

        switch(opcion){
            case 1:
                fabrica = new FactoryComponenteBajo();
                break;
            case 2:
                fabrica = new FactoryComponenteStandar();
                break;
            case 3:
                fabrica = new FactoryComponenteGamer();
                break;
        }

        pc.setMotherboard(fabrica.creaMotherboard());
    }

    /**
     * Implementación del método para instalar la fuente de poder.
     * Emplea la fabrica para setear la fuente de poder.
     */
    @Override public void instalaFuenteDePoder(){
        System.out.println("Selecciona una fuente de poder:");
        System.out.println("1. Corsair CX");
        System.out.println("2. MSI Mag");
        System.out.println("3. Cooler Master");

        int opcion = MetodosGet.getInt("Introduzca su elección", "Entrada Inválida", 1, 3);

        switch(opcion){
            case 1:
                fabrica = new FactoryComponenteBajo();
                break;
            case 2:
                fabrica = new FactoryComponenteStandar();
                break;
            case 3:
                fabrica = new FactoryComponenteGamer();
                break;
        }

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