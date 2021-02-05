package musicshop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Gibson Les Paul",6);
    }

    @Test
    public void canGetModel(){
        assertEquals("Gibson Les Paul", guitar.getModel());
    }

    @Test
    public void canSetModel(){
        guitar.setModel("Gibson S5");
        assertEquals("Gibson S5", guitar.getModel());
    }

    @Test
    public void canGetNumberOfStrings(){
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void canSetNumberOfStrings(){
        guitar.setNumberOfStrings(7);
        assertEquals(7, guitar.getNumberOfStrings());
    }

}
