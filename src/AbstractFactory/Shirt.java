package AbstractFactory;

public class Shirt implements Clothes {

    private String brand;
    public  Shirt(String brand){
        this.brand=brand;
    }

    @Override
    public void produce(){
        System.out.print("shirt"+this.brand);
    }
}
