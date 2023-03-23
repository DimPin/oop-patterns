package event.publisher;

import java.util.List;

import event.observer.Observer;

public interface Publisher {
    void add(Observer observer);
    void remove(Observer observer);
    void notify(List<Observer> observers);
}
