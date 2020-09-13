package com.design.pattern.Bridge;

public class Ax implements Weapon {
    private final int attackPoint = 5;

    @Override
    public String beUsed() {
        return "Ax , enemy lost " + this.attackPoint + " bloods!";
    }
}
