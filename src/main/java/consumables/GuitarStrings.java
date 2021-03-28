package consumables;

public class GuitarStrings extends Consumable{

    private int gauge;

    public GuitarStrings(double buyPrice, double sellPrice, int gauge) {
        super(buyPrice, sellPrice, "Guitar Strings");
        this.gauge = gauge;
    }

    public int getGauge() {
        return gauge;
    }
}
