package instrumentsTest;

import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    private Piano piano;

    @Before
    public void before() {
        piano = new Piano("Black", 88, 6000.00, 8500.00);
    }

    @Test
    public void hasKeys() {
        assertEquals(88, piano.getNumberOfKeys());
    }

    @Test
    public void canGetMarkup() {
        assertEquals(2500.00, piano.calculateMarkup(), 0.01);
    }
}
