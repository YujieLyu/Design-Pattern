package AbstractFactory;

public class NikeFactory extends AbstractFactory {

    public Clothes produceClothes(){
        return new NikeDress();

    }
    @Override
    public Shoes makeShoes() {
        return new NikeShoe();
    }

}
