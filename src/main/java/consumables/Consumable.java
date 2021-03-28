package consumables;

import behaviours.ISell;

public abstract class Consumable implements ISell {

    private double buyPrice;
    private double sellPrice;
    private String description;

    public Consumable(double buyPrice, double sellPrice, String description) {
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.description = description;
    }

    public double calculateMarkup() {
        return sellPrice - buyPrice;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public String getDescription() {
        return description;
    }
}
