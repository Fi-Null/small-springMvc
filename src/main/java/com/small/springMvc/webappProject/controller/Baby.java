package com.small.springMvc.webappProject.controller;

public class Baby {
    private String babyName;
    private int babtAge;
    private float weight;


    public Baby() {
    }

    public Baby(String babyName, int babtAge, float weight) {
        this.babyName = babyName;
        this.babtAge = babtAge;
        this.weight = weight;
    }

    public String getBabyName() {
        return babyName;
    }

    public void setBabyName(String babyName) {
        this.babyName = babyName;
    }

    public int getBabtAge() {
        return babtAge;
    }

    public void setBabtAge(int babtAge) {
        this.babtAge = babtAge;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Baby{" +
                "babyName='" + babyName + '\'' +
                ", babtAge=" + babtAge +
                ", weight=" + weight +
                '}';
    }
}
