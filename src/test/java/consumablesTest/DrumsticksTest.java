package consumablesTest;

import consumables.Drumsticks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsticksTest {

    private Drumsticks drumsticks;

    @Before
    public void before() {
        drumsticks = new Drumsticks(2.50, 12.50, "2B");
    }

    @Test
    public void hasSize() {
        assertEquals("2B", drumsticks.getSize());
    }

    @Test
    public void canGetMarkup() {
        assertEquals(10.00, drumsticks.calculateMarkup(), 0.01);
    }
}
