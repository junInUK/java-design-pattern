package com.design.pattern.Bridge;

public class Elve extends Warrior{
    public Elve(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("Elve " + this.getName() + " use " + weapon.beUsed());
    }
}
