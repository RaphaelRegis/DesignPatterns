package subjects;

import observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class Channel {
    private List<Observer> subscribers = new ArrayList<>();

    public void subscribe(Observer observer) {
        subscribers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        subscribers.remove(observer);
    }

    public void notifySubscribers(String message) {
        for (Observer subscriber : subscribers) {
            subscriber.update(message);
        }
    }
}
