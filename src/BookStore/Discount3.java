package BookStore;

public class Discount3 implements DiscountStrategy {

    private double finalPrice;
    private static final double DISCOUNT3=10;

    @Override
    public double discount(double price){
        finalPrice=price-Math.floor(price)*DISCOUNT3;
        return finalPrice;
    }
}
