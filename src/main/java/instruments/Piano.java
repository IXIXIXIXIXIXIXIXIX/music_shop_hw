package instruments;

public class Piano extends Instrument{

    private int numberOfKeys;

    public Piano(String colour, int numberOfKeys, double buyPrice, double sellPrice) {
        super(InstrumentType.KEYBOARD, "wood", "Black",  buyPrice, sellPrice);
        this.numberOfKeys = numberOfKeys;
    }


    public String play() {
        return "Plink! Plink!";
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }
}
