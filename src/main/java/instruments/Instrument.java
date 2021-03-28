package instruments;

import behaviours.IPlay;
import behaviours.ISell;


public abstract class Instrument implements IPlay, ISell {

    private InstrumentType instrumentType;
    private String constructionMaterial;
    private String colour;
    private double buyPrice;
    private double sellPrice;

    public Instrument(InstrumentType instrumentType, String constructionMaterial, String colour, double buyPrice, double sellPrice) {
        this.instrumentType = instrumentType;
        this.constructionMaterial = constructionMaterial;
        this.colour = colour;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }



    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public double calculateMarkup() {
        return this.sellPrice - this.buyPrice;
    }

    public double getBuyPrice() {
        return this.buyPrice;
    }

    public double getSellPrice() {
        return this.sellPrice;
    }
}
