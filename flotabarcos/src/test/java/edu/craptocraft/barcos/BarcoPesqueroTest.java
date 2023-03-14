package edu.craptocraft.barcos;

import org.junit.BeforeClass;
import org.junit.Test;
import static  org.junit.jupiter.api.Assertions.*;

public class BarcoPesqueroTest {

    static  BarcoPesquero barcopesquero;

    @BeforeClass public static void inicializador(){
        //Se crea un barco pesquero de 20 metros de eslora, la potencia de su motor es de 10 CV, y tiene 21 pescadores
        barcopesquero = new BarcoPesquero(20, 10, 21);
    }

    @Test public void constructorTest(){
        assertNotNull(barcopesquero);
        assertInstanceOf(Barco.class, barcopesquero);
        assertEquals("\nBarco Pesquero de 20 metros de eslora, con un motor de 10 CV y 21 pescadores", barcopesquero.toString());
    }

    @Test public void getEsloraTest(){
        assertEquals(20, barcopesquero.getEslora());
    }

    @Test public void getMotorTest(){
        assertEquals(10, barcopesquero.getMotor());
    }

    @Test public void getPescadoresTest(){
        assertEquals(21, barcopesquero.getPescadores());
    }

    @Test public void alarmaTest(){
        assertEquals("Esto es un mensaje de alarma de BarcoPesquero", barcopesquero.alarma());
    }

    @Test public void mensajeSocorroTest(){
        assertEquals("Esto es un mensaje de Socorro: ayuda mundo", barcopesquero.mensajeSocorro("ayuda mundo"));
    }


}
