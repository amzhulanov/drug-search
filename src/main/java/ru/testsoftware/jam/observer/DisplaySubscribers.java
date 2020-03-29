package ru.testsoftware.jam.observer;

public class DisplaySubscribers implements Subscriber {

    private String name;

    public DisplaySubscribers(String name) {
        this.name = name;
    }

    @Override
    public void update(Subscribers subscribers, Object arg) {
        System.out.printf("%s: %s drug %s\n",name,subscribers.toString(),arg);
    }
}
