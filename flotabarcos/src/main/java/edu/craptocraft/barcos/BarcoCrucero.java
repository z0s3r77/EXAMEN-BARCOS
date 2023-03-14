package edu.craptocraft.barcos;

public class BarcoCrucero implements Barco{

    private int eslora;
    private int[] camas ;

    public BarcoCrucero(int eslora, int camas) {
        this.eslora = eslora;
        this.camas = new int[camas];
        System.out.println(this.toString());
    }

    public int getCamasVacias() {
        int camasVacias = 0;
        for (int i = 0; i < this.camas.length; i++) {
            if (this.camas[i] == 0) {
                camasVacias++;
            }
        }
        return camasVacias;
    }

    public int getEsloraMetros() {
        return this.eslora;
    }

    @Override
    public String toString() {
        StringBuilder barco = new StringBuilder();
        barco.append("\nBarco de crucero con " + this.camas.length + " camas y " + this.eslora + " metros de eslora");
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
