import behaviours.ISell;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Shop {

    private HashMap<ISell, Integer> stock;

    public Shop() {
        stock = new HashMap<>();
    }

    public void addToStock(ISell item) {
        this.stock.merge(item, 1, Integer::sum);
    }

    public void removeFromStock(ISell item) {

        if(this.stock.containsKey(item))
        {
            this.stock.put(item, Math.min(0, this.stock.get(item) -1 ));
            if(this.stock.get(item) == 0)
            {
                this.stock.remove(item);
            }
        }
    }

    public double getTotalPotentialProfit() {

        double total = 0.00;
        Set<Map.Entry<ISell, Integer>> stockSet = stock.entrySet();

        for (Map.Entry<ISell, Integer> item: stockSet)
        {
            total += (item.getKey().calculateMarkup() * (double)item.getValue());
        }

        return total;
    }

    public int getStockSize() {
        return this.stock.size();
    }
}
