package mx.unam.ciencias.modelado.practica3;

import mx.unam.ciencias.modelado.practica3.simulaciones.Menu;

public class Main{

    /**Menu del programa */
    private static Menu menu;

    /**
     * Metodo main.
     * @param args los argumentos en consola.
     */
    public static void main(String[] args){
        menu = new Menu();
        menu.ejecutaMenu();
        menu.imprimeTicket();

    }
}