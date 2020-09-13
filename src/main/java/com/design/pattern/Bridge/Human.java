package com.design.pattern.Bridge;

public class Human extends Warrior{
    public Human(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("Human " + this.getName() + " use " + weapon.beUsed());
    }


}
