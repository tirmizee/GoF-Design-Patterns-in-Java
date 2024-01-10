package observer;

import java.util.ArrayList;
import java.util.List;

public class Subject implements Observable {

    private List<Observer> observers = new ArrayList<>();
    private int state;

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }

    public int getState() {
        return this.state;
    }

}
