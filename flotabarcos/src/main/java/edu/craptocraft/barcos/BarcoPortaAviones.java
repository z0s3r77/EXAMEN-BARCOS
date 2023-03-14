package edu.craptocraft.barcos;

public class BarcoPortaAviones implements  Barco{

    private int aviones;
    private int marineros;

    public BarcoPortaAviones(int aviones, int marineros) {
        this.aviones = aviones;
        this.marineros = marineros;
        System.out.println(this.toString());
    }

    public int getAviones() {
        return aviones;
    }

    public int getMarineros() {
        return marineros;
    }



    @Override
    public String alarma() {
        String mensaje = "Esto es un mensaje de alarma de " + this.getClass().getSimpleName();
        System.out.println(mensaje);
        return mensaje;
    }

    @Override
    public String mensajeSocorro(String mensaje) {
        String mensajeSocorro = "Esto es un mensaje de Socorro: " + mensaje;
        System.out.println(mensajeSocorro);
        return mensajeSocorro;
    }

    @Override
    public String toString() {
        StringBuilder barco = new StringBuilder();
        barco.append("\nBarco Porta Aviones con "+this.getAviones()+" aviones y "+this.getMarineros()+" marines");
        return barco.toString();
    }
}
