package ru.testsoftware.jam.proxy;

import ru.testsoftware.jam.item.Drug;
import ru.testsoftware.jam.services.DrugRepository;

import java.util.HashMap;

public class ImplDrugService implements DrugService {



    private final HashMap<String,Drug> drugSearch=new HashMap<String,Drug>();
    private final HashMap<String,Integer> drugCache=new HashMap<String,Integer>();

    /*
    метод, который получает из базы лекарство определённого наименования
    1. проверяет, есть ли эта информация в кеше
    2. если нет, то выгружает из базы и добавляет в кеш
     */
    @Override
    public Drug getDrug(String name,DrugRepository drugRepository) {
        if (drugSearch.containsKey(name)) {
            System.out.println("Выгрузка из кеша\n");
            return drugSearch.get(name);
        }else{
            drugSearch.put(name, drugRepository.getDrug(name));
            System.out.println("Выгрузка из базы\n");
            return drugRepository.getDrug(name);
        }

    }

    /*
    метод, который получает из базы кол-во лекарств определённого наименования
    1. проверяет, есть ли эта информация в кеше
    2. если нет, то выгружает из базы и добавляет в кеш
     */
    @Override
    public Integer getDrugCount(String name,DrugRepository drugRepository) {
        if (drugCache.containsKey(name)){
            return drugCache.get(name);
        }else{
            drugCache.put(name, drugRepository.getDrugCount(name));
            return drugRepository.getDrugCount(name);
        }
    }
}
