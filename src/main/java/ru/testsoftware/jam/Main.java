package ru.testsoftware.jam;

import ru.testsoftware.jam.builder.DrugBuilder;
import ru.testsoftware.jam.item.Drug;
import ru.testsoftware.jam.observer.DisplaySubscribers;
import ru.testsoftware.jam.observer.DrugSubscribe;
import ru.testsoftware.jam.proxy.ImplDrugService;
import ru.testsoftware.jam.services.DrugRepository;

public class Main {

    public static void main(String[] args) {
        DrugBuilder drugBuilder=new DrugBuilder();


        Drug drug=drugBuilder
                .id_drug(123)
                .name("product1")
                .description("product1 description")
                .cost(321)
                .build();
        System.out.println("Паттерн Builder "+drug.toString()+"\n");


        /*
        Структурный паттерн Proxy
         */

        System.out.println("\n***********Паттерн Proxy\n");
        ImplDrugService implDrugService =new ImplDrugService();
        DrugRepository drugRepository=new DrugRepository();
        drugRepository.putDrug(1,"drug1","description1",1);
        drugRepository.putDrug(2,"drug2","description2",12);
        drugRepository.putDrug(3,"drug3","description3",123);
        System.out.printf("Стоимость drug1=%s\n", implDrugService.getDrug("drug1",drugRepository));
        System.out.printf("Стоимость drug2=%s\n", implDrugService.getDrug("drug2",drugRepository));
        System.out.printf("Стоимость drug1=%s\n", implDrugService.getDrug("drug1",drugRepository));
        System.out.printf("Стоимость drug2=%s\n", implDrugService.getDrug("drug2",drugRepository));

        /*
        Паттерн наблюдатель
         */
        System.out.println("\n***********Паттерн наблюдатель\n");
        DrugSubscribe drugSubscribe =new DrugSubscribe();

        drugRepository.addSubscribe(new DisplaySubscribers("Подписчик1"));
        drugRepository.addSubscribe(new DisplaySubscribers("Подписчик2"));
        drugRepository.addSubscribe(new DisplaySubscribers("Подписчик3"));

        drugRepository.addDrug("drug1");

        //sensor.setI(5);


    }

}
