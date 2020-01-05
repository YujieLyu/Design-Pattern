package StrategyPattern;
public class Checkout {

    private DiscountStrategy discountStrategy;


    public Checkout(DiscountStrategy discountStrategy){
        this.discountStrategy=discountStrategy;
    }


    public int checkout(int price,int count){
       return discountStrategy.discount(price,count);
    }




}
