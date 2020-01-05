package ObserverPattern;

public class Missile extends Observer {

    public Missile(Radar r){
        this.radar=r;
        this.radar.attach(this);
    }

    @Override
    public void update(){
        System.out.println("I'm Missile, I'm ready to fire"+radar.getState());
    }
}
