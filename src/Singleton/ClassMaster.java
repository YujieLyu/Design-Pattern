package Singleton;

public class ClassMaster {

    private static ClassMaster master=new ClassMaster();

    private ClassMaster(){

    }

    public static ClassMaster getMaster(){
        return master;
    }

    public void speak(){
        System.out.println("I'm the only one in charge");
    }
}
