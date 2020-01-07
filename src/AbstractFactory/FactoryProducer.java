package AbstractFactory;

public class FactoryProducer {

    private static final String CLOTHES = "CLOTHES";
    private static final String SHOES = "SHOES";

    public AbstractFactory getFactory(String request) {
        switch (request.toUpperCase().trim()) {
            case CLOTHES:
                return new NikeFactory();
            case SHOES:
                return new AdidasFactory();
            default:
                return null;
        }
    }
}
