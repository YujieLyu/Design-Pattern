package AbstractFactory;

public class ShoeFactory extends AbstractFactory {

    private static final String OXFORD = "OXFORD";
    private static final String MARYJANE = "MARYJANE";

    @Override
    public Shoes makeShoes(String shoeType) {
        switch (shoeType.toUpperCase().trim()) {
            case OXFORD:
                return new OxfordShoe();
            case MARYJANE:
                return new MaryJaneShoes();
            default:
                return null;
        }
    }

    @Override
    public Clothes produceClothes(String clothesType) {
        return null;
    }
}
