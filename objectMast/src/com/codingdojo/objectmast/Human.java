package com.codingdojo.objectmast;

public class Human {

    // adding attributes below as variables


    protected int strength = 3;
    protected int intelligence = 3;
    protected int stealth = 3;
    protected int health = 100;

    public void attack(Human person) {
        person.health = person.health - strength;
    }

    public void displayHealth() {
        System.out.println(health);
    }
}
