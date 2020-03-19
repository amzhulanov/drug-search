package ru.testsoftware.jam;

import ru.testsoftware.jam.builder.DrugBuilder;
import ru.testsoftware.jam.item.Drug;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello");

        DrugBuilder drugBuilder=new DrugBuilder();
        Drug drug=drugBuilder
                .id_drug(123)
                .name("product1")
                .description("product1 description")
                .cost(321)
                .build();


        System.out.println(drug.toString());
    }

}
