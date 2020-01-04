package BookStore;

public class Discount2 implements DiscountStrategy {

    private double finalPrice;
    private static final double DISCOUNT2 = 2;

    @Override
    public double discount(double price) {
        finalPrice = price - DISCOUNT2;
        return finalPrice;
    }
}
