package AbstractFactory;

public class MaryJaneShoes implements Shoes {

    private String brand;
    public  MaryJaneShoes(String brand){
        this.brand=brand;
    }
    @Override
    public void make(){
        System.out.print("Mary Jane shoes from "+this.brand);
    }
}
