package AbstractFactory;

public abstract class AbstractFactory {
    public abstract Clothes produceClothes(String ClothesType);
    public abstract Shoes makeShoes(String ShoesType);
}
