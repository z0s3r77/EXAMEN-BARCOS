package edu.craptocraft.barcos;

import org.junit.BeforeClass;
import org.junit.Test;
import static  org.junit.jupiter.api.Assertions.*;

public class BarcoPortaavionesTest {

    static BarcoPortaaviones portaaviones;

    @BeforeClass public static void inicializador(){
        //Se crea un porta aviones de 15 aviones y 30 marines
        portaaviones = new BarcoPortaaviones(15, 30);
    }

    @Test public void constructorTest(){

        assertNotNull(portaaviones);
        assertInstanceOf(Barco.class, portaaviones);
        assertEquals("\nBarco Porta Aviones con 15 aviones y 30 marines", portaaviones.toString());

    }

    @Test public void getAvionesTest(){
        assertEquals(15, portaaviones.getAviones());
    }

    @Test public void getMarinerosTest(){
        assertEquals(30, portaaviones.getMarineros());
    }

    @Test public void alarmaTest(){
        assertEquals("Esto es un mensaje de alarma de BarcoPortaAviones", portaaviones.alarma());
    }

    @Test public void mensajeSocorroTest(){
        assertEquals("Esto es un mensaje de Socorro: ayuda mundo", portaaviones.mensajeSocorro("ayuda mundo"));
    }


}
