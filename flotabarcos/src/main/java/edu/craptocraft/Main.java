package edu.craptocraft;

import edu.craptocraft.barcos.BarcoCrucero;

public class Main {
    public static void main(String[] args) {
        System.out.println("Aplicación de Barco!");
        System.out.println("\nCreando flota...");
        //Creamos los barcos...
        BarcoCrucero crucero = new BarcoCrucero(30,10);

        //Activamos alarma
        crucero.alarma();

        //Enviamos mensaje de socorro
        crucero.mensajeSocorro("Ayuda! Nos hemos quedado tirados");

    }
}