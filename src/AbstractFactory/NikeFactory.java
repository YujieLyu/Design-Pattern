package AbstractFactory;

public class NikeFactory extends AbstractFactory {

    private static final String BRAND="NIKE";

    private static final String SHIRT="NIKE:SHIRT";
    private static final String DRESS="NIKE:DRESS";
    private static final String OXFORD = "NIKE:OXFORD";
    private static final String MARYJANE = "NIKE:MARYJANE";


    @Override
    public Clothes produceClothes(String clothesType){
        switch(clothesType.toUpperCase().trim()){
            case SHIRT:
                return new Shirt(BRAND);
            case DRESS:
                return new Dress(BRAND);
                default:
                    return null;
        }

    }
    @Override
    public Shoes makeShoes(String shoeType) {
        switch (shoeType.toUpperCase()) {
            case OXFORD:
                return new OxfordShoe(BRAND);
            case MARYJANE:
                return new MaryJaneShoes(BRAND);
            default:
                return null;
        }
    }

}
