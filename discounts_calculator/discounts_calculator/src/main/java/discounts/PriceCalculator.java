package discounts;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class PriceCalculator {

    private List<Double> prices = new ArrayList<>();
    private double discount = 0.0;

    public double getTotal() {
        double total = 0.0;

        if (!prices.isEmpty()){
            total = prices.stream().reduce(Double::sum)
                    .orElseThrow(NoSuchElementException::new);
        }
        return total * ((100-discount)/100);
    }

    public void addPrice(double price) {
        prices.add(price);

    }

    public void setDiscount(double discount) {

        this.discount = discount;
    }
}
