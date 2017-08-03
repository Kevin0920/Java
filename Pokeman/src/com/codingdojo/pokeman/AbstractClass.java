package com.codingdojo.pokeman;

public abstract class AbstractClass {

    @Override
    public Pokeman createPokemon(String name, String type, int health) {

    }

    @Override
    public void attackPokemon(Pokeman p) {
        int currentHealth -= 10;
        p.setHealth(currentHealth);
    }

}
