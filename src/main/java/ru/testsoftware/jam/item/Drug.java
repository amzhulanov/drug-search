package ru.testsoftware.jam.item;


public class Drug {


    private Integer id_drug;
    private String name;
    private String description;
    private Integer cost;

    public Drug() {
    }

    public Drug(Integer id_drug, String name, String description, Integer cost) {
        this.id_drug = id_drug;
        this.name = name;
        this.description = description;
        this.cost = cost;
    }

    public Integer getId_drug() {
        return id_drug;
    }

    public void setId_drug(Integer id_drug) {
        this.id_drug = id_drug;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Drug{" +
                "id_drug=" + id_drug +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", cost=" + cost +
                '}';
    }
}
