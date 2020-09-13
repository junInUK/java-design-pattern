package com.design.pattern.Bridge;

public class Test {
    public static void main(String[] args){
        Weapon ax = new Ax();
        Warrior sam = new Dwarf("sam");
        sam.pickWeapon(ax);
        sam.attack();

        Weapon sword = new Sword();
        Warrior jun = new Human("jun");
        jun.pickWeapon(sword);
        jun.attack();

        Weapon bow = new Bow();
        Warrior jane = new Elve("jane");
        jane.pickWeapon(bow);
        jane.attack();
    }
}
