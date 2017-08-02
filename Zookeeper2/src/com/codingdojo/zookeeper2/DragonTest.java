package com.codingdojo.zookeeper2;

public class DragonTest {
    public static void main(String[] args) {
        Dragon dragon = new Dragon();

        dragon.attackTown();
        dragon.attackTown();
        dragon.attackTown();

        dragon.fly();
        dragon.fly();

        dragon.eatHumans();
        dragon.eatHumans();

        dragon.displayEnergy();

    }
}
