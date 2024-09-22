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
import java.util.List;
import java.util.ArrayList;

/**Clase para armar una pc personalizable. */
public class PCPersonalizableBuilder implements Builder{

    /**La fabrica de componentes. */
    private ComponenteFactory fabrica;
    /**Una pc. */
    private PC pc;
    /**Lista de procesadores*/
    private List<CPU> listaCPU;
    /**Lista de Tarjetas gráficas. */
    private List<GPU> listaGPU;
    /**Lista de discos duros. */
    private List<DiscoDuro> listaDiscoDuro;
    /**Lista de fuentes de poder. */
    private List<FuenteDePoder> listaFuenteDePoder;
    /**Lista de tarjetas madre. */
    private List<Motherboard> listaMotherboard;
    /**Lista de memorias ram */
    private List<RAM> listaRAM;

    /**Constructor de la clase, inicializa atributos. */
    public PCPersonalizableBuilder(){
        pc = new PC();
        listaCPU = new ArrayList<>();
        listaGPU = new ArrayList<>();
        listaDiscoDuro = new ArrayList<>();
        listaFuenteDePoder = new ArrayList<>();
        listaMotherboard = new ArrayList<>();
        listaRAM = new ArrayList<>();
    }

    /**
     * Implementación del método para instalar el procesador.
     * Emplea la fabrica para setear el cpu.
     */
    @Override public void instalaCPU(){
        listaCPU.clear();
        listaCPU.add(new Corei3());
        listaCPU.add(new Corei5());
        listaCPU.add(new Corei9());
        listaCPU.add(new AdaptadorCPU(new Ryzen7()));

        System.out.println("Selecciona el procesador:");
        int i = 0;
        for(CPU procesador : listaCPU){
            System.out.println((++i) + ". " + procesador.getNombre() + " $" + procesador.getCosto());
        }

        int opcion = MetodosGet.getInt("Introduzca su elección", "Entrada Inválida", 1, listaCPU.size());
        
        if(opcion == 4){
            boolean eleccion = decidirIncompatible();
                
            if(!eleccion){
                instalaCPU();
                return;
            } else{
                System.out.println("Se resolverá la incompatibilidad con un adaptador.");
            }
        }

        CPU procesadorElegido = listaCPU.get(opcion-1);

        pc.setCPU(procesadorElegido);
    }

    /**
     * Implementación del método para instalar la tarjeta gráfica.
     * Emplea la fabrica para setear la gpu.
     */
    @Override public void instalaGPU(){
        listaGPU.clear();
        listaGPU.add(new GTX1030());
        listaGPU.add(new RTX4070Ti());
        listaGPU.add(new RTX3090());
        listaGPU.add(new AdaptadorGPU(new RadeonRX7600()));

        System.out.println("Selecciona la tarjeta gráfica:");

        int i = 0;
        for(GPU gpu : listaGPU){
            System.out.println((++i) + ". " + gpu.getNombre() + " $" + gpu.getCosto());
        }

        int opcion = MetodosGet.getInt("Introduzca su elección", "Entrada Inválida", 1, listaGPU.size());

        if(opcion == 4){
            boolean eleccion = decidirIncompatible();
                
            if(!eleccion){
                instalaGPU();
                return;
            } else{
                System.out.println("Se resolverá la incompatibilidad con un adaptador.");
            }
        }

        GPU gpuElegida = listaGPU.get(opcion-1);

        pc.setGPU(gpuElegida);
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
        listaRAM.add(new AdataXPG());
        listaRAM.add(new KingstonFury());
        listaRAM.add(new CorsairVengeance());

        System.out.println("Selecciona la memoria ram:");
        int i = 0;
        for(RAM ram : listaRAM){
            System.out.println((++i) + ". " + ram.getNombre() + " $" + ram.getCosto());
        }

        int opcion = MetodosGet.getInt("Introduzca su elección", "Entrada Inválida", 1, listaRAM.size());

        RAM ramElegida = listaRAM.get(opcion-1);

        pc.setRAM(ramElegida);
    }

    /**
     * Implementación del método para instalar el disco duro.
     * Emplea la fabrica para setear el disco duro.
     */
    @Override public void instalaDiscoDuro(){
        listaDiscoDuro.add(new Seagate());
        listaDiscoDuro.add(new Samsung());
        listaDiscoDuro.add(new Kingston());

        System.out.println("Selecciona el disco duro:");
        int i = 0;
        for(DiscoDuro discoDuro : listaDiscoDuro){
            System.out.println((++i) + ". " + discoDuro.getNombre() + " $" + discoDuro.getCosto());
        }

        int opcion = MetodosGet.getInt("Introduzca su elección", "Entrada Inválida", 1, listaDiscoDuro.size());

        DiscoDuro discoElegido = listaDiscoDuro.get(opcion-1);

        pc.setDiscoDuro(discoElegido);
    }

    /**
     * Implementación del método para instalar la tarjeta madre.
     * Emplea la fabrica para setear la motherboard.
     */
    @Override public void instalaMotherboard(){
        listaMotherboard.add(new ASUS());
        listaMotherboard.add(new MSI());
        listaMotherboard.add(new Gigabyte());

        System.out.println("Selecciona la tarjeta madre:");

        int i = 0;
        for(Motherboard motherboard : listaMotherboard){
            System.out.println((++i) + ". " + motherboard.getNombre() + " $" + motherboard.getCosto());
        }

        int opcion = MetodosGet.getInt("Introduzca su elección", "Entrada Inválida", 1, listaMotherboard.size());

        Motherboard motherboardElegida = listaMotherboard.get(opcion-1);

        pc.setMotherboard(motherboardElegida);
    }

    /**
     * Implementación del método para instalar la fuente de poder.
     * Emplea la fabrica para setear la fuente de poder.
     */
    @Override public void instalaFuenteDePoder(){
        listaFuenteDePoder.add(new CorsairCX());
        listaFuenteDePoder.add(new MSIMag());
        listaFuenteDePoder.add(new CoolerMaster());

        System.out.println("Selecciona la fuente de poder:");

        int i = 0;
        for(FuenteDePoder fuentePoder : listaFuenteDePoder){
            System.out.println((++i) + ". " + fuentePoder.getNombre() + " $" + fuentePoder.getCosto());
        }


        int opcion = MetodosGet.getInt("Introduzca su elección", "Entrada Inválida", 1, listaFuenteDePoder.size());

        FuenteDePoder fuenteDePoderElegida = listaFuenteDePoder.get(opcion-1);

        pc.setFuenteDePoder(fuenteDePoderElegida);
    }

    /**
     * Implementación del método para obtener la pc.
     * @return una instancia de PC.
     */
    @Override public PC getPC(){
        return pc;
    }
}

