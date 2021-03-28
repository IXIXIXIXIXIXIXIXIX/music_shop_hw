package instrumentsTest;

import instruments.Guitar;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    private Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("black", 700.00, 1200.00, 6);
    }

    @Test
    public void hasType() {
        assertEquals(InstrumentType.STRINGS, guitar.getInstrumentType());
    }

    @Test
    public void hasStrings() {
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void canPlay() {
        assertEquals("Strrummm!", guitar.play());
    }

    @Test
    public void canGetMarkup() {
        assertEquals(500.0, guitar.calculateMarkup(), 0.01);
    }

    @Test
    public void canGetPrice() {
        assertEquals(1200.00, guitar.getSellPrice(), 0.01);
    }


}
