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
    /**Lista de modelos de pc's */
    private List<Builder> modelos;

    /**Constructor de la clase, inicializa la lista de modelos */
    public Menu(){
        modelos = new ArrayList<>();
        modelos.add(new PCGamerBuilder());
        modelos.add(new PCStandarBuilder());
        modelos.add(new PCBajaBuilder());
        modelos.add(new PCPersonalizableBuilder());
    }

    /**
     * Método que engloba los 4 posibles modelos de computadoras.
     * @return una cadena con las 4 elecciones para el usuairo.
     */
    private String menuModelos(){
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for(Builder modelo: modelos){
            sb.append((++i) + ". " + modelo.getClass().getSimpleName().replace("Builder","") + "\n");
        }
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
        int opcion = MetodosGet.getInt("Escoja: ", "Entrada inválida", 1, modelos.size());

        armador = modelos.get(opcion-1);

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
