package consumablesTest;

import consumables.GuitarStrings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {

    private GuitarStrings guitarStrings;

    @Before
    public void before() {
        guitarStrings = new GuitarStrings(2.00, 6.00, 11);
    }

    @Test
    public void hasGauge() {
        assertEquals(11, guitarStrings.getGauge());
    }

    @Test
    public void canGetMarkup() {
        assertEquals(4.00, guitarStrings.calculateMarkup(), 0.01);
    }
}
