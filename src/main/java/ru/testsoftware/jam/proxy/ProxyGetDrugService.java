package ru.testsoftware.jam.proxy;

import ru.testsoftware.jam.item.Drug;
import ru.testsoftware.jam.services.DrugService;

import java.util.HashMap;

public class ProxyGetDrugService implements GetDrugService{

    private final DrugService drugService=new DrugService();

    private final HashMap<String,Drug> drugSearch=new HashMap<String,Drug>();

    @Override
    public Drug getDrug(String name) {
        if (drugSearch.containsKey(name)) {
            System.out.println("Выгрузка из кеша\n");
            return drugSearch.get(name);
        }else{
            drugSearch.put(name,drugService.getDrug(name));
            System.out.println("Выгрузка из базы\n");
            return drugService.getDrug(name);
        }

    }
}
