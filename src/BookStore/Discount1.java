package BookStore;

public class Discount1 implements DiscountStrategy {

    private int finalPrice;
    private static final double DISCOUNT1 = 0.9;

    @Override
    public int discount(int price,int count) {
        finalPrice = (int) (price * DISCOUNT1*count);
        return finalPrice;
    }
}
