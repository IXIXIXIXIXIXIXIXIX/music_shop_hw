import instruments.Guitar;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private Guitar guitar;
    private Guitar guitar2;
    private Piano piano;
    private Shop shop;

    @Before
    public void before(){

        guitar = new Guitar("black", 700.00, 1200.00, 6);
        guitar2 = new Guitar("black", 700.00, 1200.00, 6);
        piano = new Piano("Black", 88, 6000.00, 8500.00);
        shop = new Shop();

    }

    @Test
    public void canAddToStock() {
        shop.addToStock(guitar);

        assertEquals(1, shop.getStockSize());
    }

    @Test
    public void canRemoveFromStock() {
        shop.addToStock(guitar);
        shop.addToStock(guitar2);
        shop.addToStock(piano);
        assertEquals(3, shop.getStockSize());

        shop.removeFromStock(guitar);
        assertEquals(2, shop.getStockSize());
    }

    @Test
    public void canGetPotentialProfit() {

        shop.addToStock(guitar);
        shop.addToStock(guitar2);
        shop.addToStock(piano);

        assertEquals(3500.00, shop.getTotalPotentialProfit(), 0.01);

    }

}
