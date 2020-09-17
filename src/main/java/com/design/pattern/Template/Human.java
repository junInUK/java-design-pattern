package com.design.pattern.Template;

public class Human extends Warrior {

    public Human(String name) {
        super(name);
    }

    @Override
    void chooseHelmet() {
        System.out.println("Human Helmet");
    }

    @Override
    void chooseArmor() {
        System.out.println("Human Armor");
    }

    @Override
    void chooseBoots() {
        System.out.println("Human Boots");
    }

    @Override
    void chooseWeapon() {
        System.out.println("Sword");
    }
}
