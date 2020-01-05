package ObserverPattern;

public class Cannon extends Observer {
    public Cannon(Radar r){
        this.radar=r;
        this.radar.attach(this);
    }

    @Override
    public void update(){
        System.out.println("I'm Cannon, I'm firing"+radar.getState());
    }

}
