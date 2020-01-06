package ObserverPattern;

public class Missile implements Observer {

    @Override
    public void update(){
        System.out.println("I'm Missile, I'm ready to fire");
    }
}
