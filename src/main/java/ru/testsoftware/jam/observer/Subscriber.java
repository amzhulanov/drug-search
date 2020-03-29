package ru.testsoftware.jam.observer;




public interface Subscriber {

    void update(Subscribers subject, Object arg);

}
