package com.codingdojo.pokeman;

public class Pokeman {

    private String name;
    private int health;
    private String type;

    public static int count;

    public Pokeman {
        this.name = name;
        this.type = type;
        this.health = health;
        count++;
    }


    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public String getType() {
        return type;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static void setCount(int count) {
        Pokeman.count = count;
    }

    public static int getCount() {
        return count;
    }
}
