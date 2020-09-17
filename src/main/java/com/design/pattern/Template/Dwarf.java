package com.design.pattern.Template;

public class Dwarf extends Warrior {

    public Dwarf(String name) {
        super(name);
    }

    @Override
    void chooseHelmet() {
        System.out.println("Dwarf Helmet");
    }

    @Override
    void chooseArmor() {
        System.out.println("Dwarf Armor");
    }

    @Override
    void chooseBoots() {
        System.out.println("Dwarf Boots");
    }

    @Override
    void chooseWeapon() {
        System.out.println("Ax");
    }
}
