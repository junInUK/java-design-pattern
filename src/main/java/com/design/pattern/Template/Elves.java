package com.design.pattern.Template;

public class Elves extends Warrior{

    public Elves(String name) {
        super(name);
    }

    @Override
    void chooseHelmet() {
        System.out.println("Elves Helmet");
    }

    @Override
    void chooseArmor() {
        System.out.println("Elves Armor");
    }

    @Override
    void chooseBoots() {
        System.out.println("Elves Boots");
    }

    @Override
    void chooseWeapon() {
        System.out.println("Bow");
    }
}
