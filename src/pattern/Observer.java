package pattern;

import java.util.ArrayList;
import java.util.List;

public class Observer {

    private List<Observer> observers = new ArrayList<>();

    public static void main(String[] args) {


        var observer1 = new Observer();
        var observer2 = new Observer();
        var server = new Observer();
        observer1.subscribe(server);
        observer2.subscribe(server);
        server.notifyObservers("Hello");
    }

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void update(String message) {
        System.out.println("message = " + message);
    }
}
