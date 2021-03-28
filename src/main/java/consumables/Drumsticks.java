package consumables;

public class Drumsticks extends Consumable{
    private String size;

    public Drumsticks(double buyPrice, double sellPrice, String size) {
        super(buyPrice, sellPrice, "Drumsticks");
        this.size = size;
    }

    public String getSize() {
        return size;
    }
}
