package ru.testsoftware.jam.observer;

public class DrugSubscribe extends Subscribers {

    private int t;

    public int getI() {
        return t;
    }

    public void setI(int t) {
        this.t = t;
        notify(t);
    }
}
