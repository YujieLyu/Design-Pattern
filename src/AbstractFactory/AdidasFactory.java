package AbstractFactory;

public class AdidasFactory extends AbstractFactory {


    @Override
    public Shoes makeShoes() {
        return new AdidasShoe();
    }


    @Override
    public Clothes produceClothes(){
            return new AdidasDress();
    }
}
