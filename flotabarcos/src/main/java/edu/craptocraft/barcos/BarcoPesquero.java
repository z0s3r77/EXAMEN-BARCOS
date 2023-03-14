package edu.craptocraft.barcos;

public class BarcoPesquero implements Barco {

    private final int eslora;
    private final int motor;
    private final int pescadores;

    public BarcoPesquero(int eslora, int motor, int pescadores) {
        this.eslora = eslora;
        this.motor = motor;
        this.pescadores = pescadores;
        System.out.println(this.toString());
    }

    public int getEslora() {
        return this.eslora;
    }

    public int getMotor() {
        return this.motor;
    }

    public int getPescadores() {
        return this.pescadores;
    }

    @Override
    public String toString() {
        StringBuilder barco = new StringBuilder();
        barco.append("\nBarco Pesquero de " + this.eslora + " metros de eslora, con un motor de " + this.motor + " CV y " + this.pescadores + " pescadores");
        return barco.toString();
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
}
