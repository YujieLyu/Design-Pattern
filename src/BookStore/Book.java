package BookStore;

public class Book {
    private int price;
    private String name;
    private String author;
    private String type;

    public Book(int price, String name, String author, String type) {
        this.price = price;
        this.name = name;
        this.author = author;
        this.type = type;

    }

    public void setPrice(String price) throws IllegalArgumentException {
        if (price.matches("d+")) {
            throw new IllegalArgumentException("Invalid price");
        }
        this.price = Integer.parseInt(price);
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getType() {
        return type;
    }


}
