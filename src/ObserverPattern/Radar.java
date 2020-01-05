package ObserverPattern;

import java.util.ArrayList;

public class Radar {

    private ArrayList<Observer> observers=new ArrayList<>();

    private int state;

    public int getState(){
        return state;
    }

    public void setState(int state){
        this.state=state;
        notifyAllObserver();

    }

    public void attach(Observer observer){
        observers.add(observer);
    }
    public void notifyAllObserver(){
        for(Observer o:observers){
            o.update();
        }
    }
}
