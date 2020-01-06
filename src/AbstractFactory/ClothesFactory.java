package AbstractFactory;

public class ClothesFactory extends AbstractFactory {

    private static final String SHIRT="SHIRT";
    private static final String DRESS="DRESS";

    @Override
    public Clothes produceClothes(String clothesType){
        switch(clothesType.toUpperCase().trim()){
            case SHIRT:
                return new Shirt();
            case DRESS:
                return new Dress();
                default:
                    return null;
        }

    }

    @Override
    public Shoes makeShoes(String shoeType){
        return null;
    }
}
