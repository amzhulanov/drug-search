package ru.testsoftware.jam.services;

import ru.testsoftware.jam.item.Drug;

import java.util.ArrayList;
import java.util.List;

public class DrugService {
    private List<Drug> drugList=new ArrayList();



    public Drug getDrug(String name) {
        drugList.add(new Drug(1,"drug1","description1",1));
        drugList.add(new Drug(2,"drug2","description2",12));
        drugList.add(new Drug(3,"drug3","description2",123));

        for(Drug dr:drugList){
            if (dr.getName().equals(name)){
                return dr;
            }
        }
        return null;
    }
}
