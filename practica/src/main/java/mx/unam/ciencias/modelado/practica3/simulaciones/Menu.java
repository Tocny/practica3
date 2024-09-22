package mx.unam.ciencias.modelado.practica3.simulaciones;

import mx.unam.ciencias.modelado.practica3.common.*;
import mx.unam.ciencias.modelado.practica3.builder.*;
import java.util.List;
import java.util.ArrayList;

/**Clase que representa un menu general del programa. */
public class Menu{
    
    /**Instancia de director para armar una computadora. */
    private Director director;
    /**Instancia de armador para determinar el constructor de la pc. */
    private Builder armador;

    /**
     * Método que engloba los 4 posibles modelos de computadoras.
     * @return una cadena con las 4 elecciones para el usuairo.
     */
    private String menuModelos(){
        StringBuilder sb = new StringBuilder();
        sb.append("Modelos disponibles:\n");
        sb.append("1. Computadora Gamer\n");
        sb.append("2. Computadora de gama media\n");
        sb.append("3. Computadora de gama baja\n");
        sb.append("4. Diseño personalizado.");
        return sb.toString();
    }

    /**
     * Método para ejecutar el menu general del programa.
     * En general es un menu para escojer un modelo de computadora.
     */
    public void  ejecutaMenu(){
        System.out.println("Bienvenidx a Los Amantes de Intel");
        System.out.println("Considere las siguientes opciones para su computadora:");
        System.out.println(menuModelos());
        int opcion = MetodosGet.getInt("Escoja: ", "Entrada inválida", 1, 4);

        switch(opcion){
            case 1:
                armador = new PCGamerBuilder();
                break;
            case 2:
                armador = new PCStandarBuilder();
                break;
            case 3:
                armador = new PCBajaBuilder();
                break;
            case 4:
                armador = new PCPersonalizableBuilder();
                break;
        }

        this.director = new Director(armador);
        this.director.armaPC();

    }

    /**
     * Método que imprime el ticket de compra de la computadora.
     */
    public void imprimeTicket(){
        System.out.println(this.director.getPC().ticket());
    }
}
