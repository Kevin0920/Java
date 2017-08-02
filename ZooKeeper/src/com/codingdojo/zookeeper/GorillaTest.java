package com.codingdojo.zookeeper;

public class GorillaTest {
    public static void main(String[] args) {

        Gorilla gorilla = new Gorilla();

        gorilla.throwing();
        gorilla.throwing();
        gorilla.throwing();
        gorilla.eatBananas();
        gorilla.eatBananas();
        gorilla.climb();

        gorilla.displayEnergy();
    }
}
