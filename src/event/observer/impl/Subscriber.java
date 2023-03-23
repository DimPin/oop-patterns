package event.observer.impl;

import java.util.List;

import event.observer.Observer;

public class Subscriber implements Observer {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacansies) {
        System.out.printf("Dear %s!%n We have some changes in vacancies:%s%n", name, vacansies);
        System.out.printf("%n====================================%n");
    }
}
