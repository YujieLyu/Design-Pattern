package BookStore;

public class Discount1 implements DiscountStrategy {

    private double finalPrice;
    private static final double DISCOUNT1 = 0.9;

    @Override
    public double discount(double price) {
        finalPrice = price * DISCOUNT1;
        return finalPrice;
    }
}
