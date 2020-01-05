package StrategyPattern;

public class Discount3 implements DiscountStrategy {

    private int finalPrice;
    private static final int DISCOUNT3=10;

    @Override
    public int discount(int price,int count){
        int subTotal=price*count;
        finalPrice= subTotal<100?subTotal: (int) (subTotal - Math.floor(subTotal / 100) * DISCOUNT3);
        return finalPrice;
    }
}
