import java.util.ArrayList;
import java.util.List;

/**
 * @author liyang
 * @description
 **/
public class Bird implements Subject {
    private List<Observer> observers = new ArrayList<Observer>();

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i > -1) {
            observers.remove(i);
        }
    }

    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update("bird: I fly");
        }
    }
}
