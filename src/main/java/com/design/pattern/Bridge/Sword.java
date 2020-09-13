package com.design.pattern.Bridge;

public class Sword implements Weapon{

    private final int attackPoint = 6;

    @Override
    public String beUsed() {
        return "Sword , enemy lost " + this.attackPoint + " bloods!";
    }

}
