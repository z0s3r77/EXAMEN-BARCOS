package edu.craptocraft.barcos;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BarcocruceroTest {

    static BarcoCrucero crucero;

    @BeforeClass public static void inicializador(){
        //Se crea un barco con 50 metros de eslora y 20 camas
        crucero = new BarcoCrucero(50, 20);
    }

    @Test
    public void constructorTest(){
        assertNotNull(crucero);
        assertInstanceOf(Barco, crucero);
    }

}
