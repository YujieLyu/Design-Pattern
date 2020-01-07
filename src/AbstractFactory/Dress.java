package AbstractFactory;

public class Dress implements Clothes{
    private String brand;
    public  Dress(String brand){
        this.brand=brand;
    }
    @Override
    public void produce(){
        System.out.print( "dress from "+ this.brand);

    }
}
