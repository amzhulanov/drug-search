package ru.testsoftware.jam.services;

import ru.testsoftware.jam.item.Drug;
import ru.testsoftware.jam.observer.Subscribers;

import java.util.ArrayList;
import java.util.List;

public class DrugRepository extends Subscribers {
    private List<Drug> drugList=new ArrayList();

    public void putDrug(Integer id_drug, String name, String description, Integer cost){
        drugList.add(new Drug(id_drug,name,description,cost));
    }


    public Drug getDrug(String name) {
        for(Drug dr:drugList){
            if (dr.getName().equals(name)){
                return dr;
            }
        }
        return null;
    }

    public void addDrug(String name){
        notify(name);

    }
    public int getDrugCount(String name){
        return (int)(Math.random()*10);
    }
}
