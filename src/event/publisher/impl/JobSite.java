package event.publisher.impl;

import java.util.ArrayList;
import java.util.List;

import event.observer.Observer;
import event.publisher.Publisher;

public class JobSite implements Publisher {
    private final List<Observer> observers;
    private final List<String> vacansies;    
    
    public JobSite() {
        this.observers = new ArrayList<>();
        this.vacansies = new ArrayList<>();
    }

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notify(List<Observer> observers) {
        for (Observer observer : observers) {
            observer.handleEvent(vacansies);
        }
    }

    public void addVacansy(String vacansy) {
        vacansies.add(vacansy);
        notify(observers);
    }

    public void removeVacansy(String vacansy) {
        vacansies.remove(vacansy);
        notify(observers);
    }
}
