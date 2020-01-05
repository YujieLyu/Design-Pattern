public class ImmutableTest {
    public static void main(String[] args) {
        Goat xiaoEn = new Goat();
        xiaoEn.name = "XiaoEn";
        System.out.println(xiaoEn);

        Goat fakeXiaoEn = new Goat(xiaoEn);
        fakeXiaoEn.name = "DaHuiLang";
        System.out.println(xiaoEn);
    }


}

class Goat {
    String name;

    public Goat() {
    }

    public Goat(Goat another) {
        name = another.name;
    }

    @Override
    public String toString() {
        return name;
    }
}
