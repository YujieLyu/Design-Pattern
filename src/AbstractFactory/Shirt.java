package AbstractFactory;

public class Shirt implements Clothes {

    @Override
    public void produce(){
        System.out.print("shirt");
    }
}
