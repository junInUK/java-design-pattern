package com.design.pattern.Bridge;

public class Bow implements Weapon{
    private final int attackPoint = 7;

    @Override
    public String beUsed() {
        return "Bow , enemy lost " + this.attackPoint + " bloods!";
    }
}
