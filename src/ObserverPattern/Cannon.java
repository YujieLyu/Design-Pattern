package ObserverPattern;

public class Cannon implements Observer {

    @Override
    public void update(){
        System.out.println("I'm Cannon, I'm firing");
    }

}
