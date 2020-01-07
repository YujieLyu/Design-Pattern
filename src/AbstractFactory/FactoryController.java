package AbstractFactory;

public class FactoryController {
    public static void main(String[] args) {
        AbstractFactory nikeFactory = new FactoryProducer().getFactory("Nike");
        AbstractFactory adidasFactory = new FactoryProducer().getFactory("Adidas");

        //prepare a dress+ Mary Jane shoes
        System.out.print("This is a ");
        Clothes dress = nikeFactory.produceClothes();
        dress.produce();
        System.out.print(", needs to be wear with a ");
        Shoes mjShoes = adidasFactory.makeShoes();
        mjShoes.make();

    }
}
