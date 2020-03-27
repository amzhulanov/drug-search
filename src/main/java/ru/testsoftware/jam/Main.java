package ru.testsoftware.jam;

import ru.testsoftware.jam.builder.DrugBuilder;
import ru.testsoftware.jam.item.Drug;
import ru.testsoftware.jam.proxy.ProxyGetDrugService;

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
        System.out.println("Паттерн Proxy\n");
        ProxyGetDrugService proxyGetDrugService=new ProxyGetDrugService();
        System.out.printf("Стоимость drug1=%s\n",proxyGetDrugService.getDrug("drug1"));
        System.out.printf("Стоимость drug2=%s\n",proxyGetDrugService.getDrug("drug2"));
        System.out.printf("Стоимость drug1=%s\n",proxyGetDrugService.getDrug("drug1"));
        System.out.printf("Стоимость drug2=%s\n",proxyGetDrugService.getDrug("drug2"));
    }

}
