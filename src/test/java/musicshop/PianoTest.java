package musicshop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("Brown", "Piano", "Roland RP701");
    }

    @Test
    public void canGetManufacturer(){
        assertEquals("Roland RP701", piano.getManufacturer());
    }

    @Test
    public void canSetManufacturer(){
        piano.setManufacturer("Yamaha YDP-144");
        assertEquals("Yamaha YDP-144", piano.getManufacturer());
    }

    @Test
    public void hasColour(){
        assertEquals("Brown", piano.getColour());
    }

    @Test
    public void setColour(){
        piano.setColour("Black");
        assertEquals("Black",piano.getColour());
    }

    @Test
    public void hasType(){
        assertEquals("Piano", piano.getType());
    }

    @Test
    public void setType(){
        piano.setType("Keyboard");
        assertEquals("Keyboard", piano.getType());
    }

    @Test
    public void canPlay(){
        assertEquals("plink", piano.play());
    }
}
