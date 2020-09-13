package com.design.pattern.Bridge;

public class Dwarf extends Warrior {

    public Dwarf(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("Dwarf " + this.getName() + " use " + weapon.beUsed());
    }
}
