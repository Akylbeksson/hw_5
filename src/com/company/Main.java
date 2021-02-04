package com.company;

public class Main {

    public static void main(String[] args) {


        Boss boss1 = new Boss();
        boss1.setHealth(800);
        boss1.setDamage(50);
        boss1.setDefenceType("the hero's ability");
        System.out.println("The Boss' health is " + boss1.getHealth());
        System.out.println("The Boss' damage is " + boss1.getDamage());
        System.out.println("The Boss' defence type is " + boss1.getDefenceType());

    }
}
