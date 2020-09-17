package com.design.pattern.Template;

public abstract class Warrior {

    private String name;

    public Warrior(String name) {
        this.name = name;
    }

    abstract void chooseHelmet();
    abstract void chooseArmor();
    abstract void chooseBoots();
    abstract void chooseWeapon();

    public final void dressUp(){
        System.out.println(this.name);
        chooseArmor();
        chooseBoots();
        chooseHelmet();
        chooseWeapon();
    }
}
