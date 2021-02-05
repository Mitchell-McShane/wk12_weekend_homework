package musicshop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("Roland RP701");
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
}
