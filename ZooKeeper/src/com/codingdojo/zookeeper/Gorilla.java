package com.codingdojo.zookeeper;

public class Gorilla extends Mammal {

    public void throwing() {

        System.out.println("Gorilla throw banana");
        this.energyLevel = energyLevel - 10;

    }

    public void eatBananas() {

        System.out.println("Gorilla eat banana regaining energy as");
        this.energyLevel = energyLevel + 10;
    }

    public void climb() {
        System.out.println("Gorilla climb");
        this.energyLevel = energyLevel - 10;
    }
}