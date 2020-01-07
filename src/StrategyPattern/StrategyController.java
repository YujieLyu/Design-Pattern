package StrategyPattern;

import java.util.Scanner;

public class StrategyController {
    public static void main(String[] args) {
        int totalPrice = 0;
        String item;
        String[] itemAttr;
        int price;
        String name;
        String author;
        String type;
        int count;
        final String COMPUTER = "COMPUTER";
        final String LANGUAGE = "LANGUAGE";
        final String NOVEL = "NOVEL";


        System.out.println("Welcome to online StrategyPattern, please enter your book's price, name, author, type and number in this type 'price, name, author, type, number'");

        Scanner scanner = new Scanner(System.in);

        while (!(item = scanner.next()).isEmpty()) {

            try {
                itemAttr = item.toUpperCase().trim().split("[, ]+");
                price = Integer.parseInt(itemAttr[0]);
                name = itemAttr[1];
                author = itemAttr[2];
                type = itemAttr[3];
                count = Integer.parseInt(itemAttr[4]);
                Checkout checkout = null;
                switch (type) {
                    case COMPUTER:
                        checkout = new Checkout(new Discount1());
                        break;
                    case LANGUAGE:
                        checkout = new Checkout(new Discount2());
                        break;
                    case NOVEL:
                        checkout = new Checkout(new Discount3());
                        break;
                }
                totalPrice += checkout != null ? checkout.getTotal(price, count) : 0;


                System.out.println(totalPrice);
            } catch (NumberFormatException e) {
                System.out.println(e);
            }
        }
        scanner.close();
    }
}
