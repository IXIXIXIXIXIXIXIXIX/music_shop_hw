package instruments;

public class Guitar extends Instrument{
    private int numberOfStrings;

    public Guitar(String colour, double buyPrice, double sellPrice, int numberOfStrings) {
        super(InstrumentType.STRINGS, "wood", colour,  buyPrice, sellPrice);
        this.numberOfStrings = numberOfStrings;
    }

    public String play() {
        return "Strrummm!";
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }
}
