package AbstractFactory;

public class FactoryController {
    public static void main(String[] args) {
        AbstractFactory factory = new FactoryProducer().getFactory("clothes");
        AbstractFactory factory1 = new FactoryProducer().getFactory("shoes");

        //prepare a dress+ Mary Jane shoes
        System.out.print("This is a ");
        Clothes dress = factory.produceClothes("dress");
        dress.produce();
        System.out.print(", needs to be wear with a ");
        Shoes mjShoes = factory1.makeShoes("MaryJane");
        mjShoes.make();

    }
}
