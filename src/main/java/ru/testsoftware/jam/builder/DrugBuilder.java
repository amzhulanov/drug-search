package ru.testsoftware.jam.builder;

import ru.testsoftware.jam.item.Drug;

public class DrugBuilder {

    private final Drug drug;

    public DrugBuilder() {
        this.drug=new Drug();
    }

    public DrugBuilder id_drug(Integer id_drug){
        drug.setId_drug(id_drug);
        return this;
    }

    public DrugBuilder name(String name){
        drug.setName(name);
        return this;
    }

    public DrugBuilder description(String description){
        drug.setDescription(description);
        return this;
    }

    public DrugBuilder cost(Integer cost){
        drug.setCost(cost);
        return this;
    }

    public Drug build(){
        return drug;
    }
}
