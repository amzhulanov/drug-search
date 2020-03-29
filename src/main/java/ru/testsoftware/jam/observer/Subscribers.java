package ru.testsoftware.jam.observer;

import java.util.ArrayList;
import java.util.List;

public class Subscribers {

    private List<Subscriber> subscriberList=new ArrayList<Subscriber>();

    public void addSubscribe(Subscriber subscriber){
        subscriberList.add(subscriber);
    }

    public void unSubscribe(Subscriber subscriber){
        subscriberList.remove(subscriber);
    }

    public Boolean getSubscriber(Subscriber subscriber){

        return true;
    }

    public void notify(Object arg){
        for (Subscriber subscriber:subscriberList){
            subscriber.update(this,arg);
        }

    }

    @Override
    public String toString() {
        return "Subscribers{" +
                "subscriberList=" + subscriberList +
                '}';
    }
}
