package com.codingdojo.zookeeper2;

public class Dragon extends mammals {

    public Dragon () {
        this.energyLevel = 300;
    }

    public void fly() {
        System.out.println("Dragon is flying");
        this.energyLevel = energyLevel - 50;

    }
    public void eatHumans() {
        System.out.println("so- well, never mind");
        this.energyLevel = energyLevel + 25;
    }
    public void attackTown() {
        System.out.println("Dragon is attacking a town, and it is on fire");
        this.energyLevel = energyLevel - 100;
    }
}

