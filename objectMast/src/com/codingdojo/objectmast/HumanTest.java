package com.codingdojo.objectmast;

public class HumanTest {
    public static void main(String[] args) {
        Human person = new Human();
        Human personX = new Human();

        person.attack(personX);
        personX.attack(person);

        personX.displayHealth();
        person.displayHealth();
    }
}
