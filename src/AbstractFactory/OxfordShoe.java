package AbstractFactory;

public class OxfordShoe implements Shoes {

    private String brand;
    public  OxfordShoe(String brand){
        this.brand=brand;
    }
    @Override
    public void make(){
        System.out.print("Oxford shoes from "+this.brand);
    }
}
