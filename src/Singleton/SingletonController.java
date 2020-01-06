package Singleton;

public class SingletonController {
    public static void main(String[] args){
        ClassMaster classMaster=ClassMaster.getMaster();
        classMaster.speak();
    }
}
