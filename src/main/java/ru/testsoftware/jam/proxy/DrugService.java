package ru.testsoftware.jam.proxy;

import ru.testsoftware.jam.item.Drug;
import ru.testsoftware.jam.services.DrugRepository;

public interface DrugService {

    Drug getDrug(String name, DrugRepository drugRepository);
    Integer getDrugCount(String name,DrugRepository drugRepository);
}