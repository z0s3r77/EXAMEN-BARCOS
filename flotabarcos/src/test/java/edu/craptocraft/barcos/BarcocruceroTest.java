package edu.craptocraft.barcos;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BarcocruceroTest {

    static BarcoCrucero crucero;

    @BeforeClass public static void inicializador(){
        //Se crea un barco con 50 metros de eslora y 20 camas
        crucero = new BarcoCrucero(50, 20);
    }

    @Test public void constructorTest(){
        assertNotNull(crucero);
        assertInstanceOf(Barco.class, crucero);
        assertEquals("\nBarco de crucero con 20 camas y 50 metros de eslora", crucero.toString());
    }

    @Test public  void getCamasVaciasTest(){
        assertEquals(20, crucero.getCamasVacias());
    }

    @Test public void getEsloraMetrosTest(){
        assertEquals(50, crucero.getEsloraMetros());
    }

    @Test public void alarmaTest(){
        assertEquals("Esto es un mensaje de alarma de BarcoCrucero", crucero.alarma());
    }

    @Test public void mensajeSocorroTest(){
        assertEquals("Esto es un mensaje de Socorro: ayuda mundo", crucero.mensajeSocorro("ayuda mundo"));
    }

}
