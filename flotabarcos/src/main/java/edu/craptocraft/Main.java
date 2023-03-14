package edu.craptocraft;

import edu.craptocraft.barcos.BarcoCrucero;
import edu.craptocraft.barcos.BarcoPesquero;
import edu.craptocraft.barcos.BarcoPortaAviones;

public class Main {
    public static void main(String[] args) {
        System.out.println("Aplicación de Barco!");
        System.out.println("\nCreando flota...");
        //Creamos los barcos...
        BarcoCrucero crucero = new BarcoCrucero(30,10);
        BarcoPortaAviones portaAviones = new BarcoPortaAviones(15, 40);
        BarcoPesquero pesquero = new BarcoPesquero(10, 100, 5);

        System.out.println("\n Enviando mensajes de alarma y socorro! \n");

        //Activamos alarma
        crucero.alarma();
        portaAviones.alarma();
        pesquero.alarma();

        //Enviamos mensaje de socorro
        crucero.mensajeSocorro("Ayuda! Nos hemos quedado tirados");
        portaAviones.mensajeSocorro("Ayuda! Nos hemos quedado tirados en alta mar");
        pesquero.mensajeSocorro("Ayuda! Nos hemos quedado tirados en alta mar con 3 sardinas");
    }
}