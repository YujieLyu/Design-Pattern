package ObserverPattern;

public class ObserverController {
    public static void main(String[] args){
        Radar radar=new Radar();
        Cannon cannon=new Cannon(radar);
        Missile missile=new Missile(radar);

        radar.setState(14);
        radar.setState(34234);
    }
}
