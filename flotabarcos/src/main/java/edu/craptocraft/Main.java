package edu.craptocraft;

import edu.craptocraft.barcos.BarcoCrucero;
import edu.craptocraft.barcos.BarcoPortaAviones;

public class Main {
    public static void main(String[] args) {
        System.out.println("Aplicación de Barco!");
        System.out.println("\nCreando flota...");
        //Creamos los barcos...
        BarcoCrucero crucero = new BarcoCrucero(30,10);
        BarcoPortaAviones portaAviones = new BarcoPortaAviones(15, 40);

        //Activamos alarma
        crucero.alarma();
        portaAviones.alarma();

        //Enviamos mensaje de socorro
        crucero.mensajeSocorro("Ayuda! Nos hemos quedado tirados");
        portaAviones.mensajeSocorro("Ayuda! Nos hemos quedado tirados en alta mar");
    }
}