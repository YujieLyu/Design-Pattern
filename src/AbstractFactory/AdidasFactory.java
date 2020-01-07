package AbstractFactory;

public class AdidasFactory extends AbstractFactory {

    private static final String BRAND="ADIDAS";

    private static final String SHIRT="ADIDAS:SHIRT";
    private static final String DRESS="ADIDAS:DRESS";
    private static final String OXFORD = "ADIDAS:OXFORD";
    private static final String MARYJANE = "ADIDAS:MARYJANE";


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


    @Override
    public Clothes produceClothes(String clothesType){
        switch(clothesType.toUpperCase()){
            case SHIRT:
                return new Shirt(BRAND);
            case DRESS:
                return new Dress(BRAND);
            default:
                return null;
        }

    }
}
