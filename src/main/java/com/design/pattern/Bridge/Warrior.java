package com.design.pattern.Bridge;

public abstract class Warrior {
    Weapon weapon;
    private String name;

    public Warrior(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void pickWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public abstract void attack();
}
