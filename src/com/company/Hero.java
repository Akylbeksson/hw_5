package com.company;

public class Hero {
    private int health;
    private int damage;
    private String superAbility;

    public Hero(int health, int damage, String superAbility) {
        this.damage = damage;
        this.health = health;
        this.superAbility = superAbility;

    }

    public Hero(int health, int damage) {
        this.damage = damage;
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperAbility() {
        return superAbility;
    }
}

