package AbstractFactory;

public class FactoryProducer {

    private static final String NIKE = "NIKE";
    private static final String ADIDAS = "ADIDAS";

    public AbstractFactory getFactory(String request) {
        switch (request.toUpperCase().trim()) {
            case NIKE:
                return new NikeFactory();
            case ADIDAS:
                return new AdidasFactory();
            default:
                return null;
        }
    }
}
