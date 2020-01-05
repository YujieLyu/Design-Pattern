package BookStore;

public class Discount2 implements DiscountStrategy {

    private int finalPrice;
    private static final int DISCOUNT2 = 2;

    @Override
    public int discount(int price,int count) {
        finalPrice = (price - DISCOUNT2)*count;
        return finalPrice;
    }
}
