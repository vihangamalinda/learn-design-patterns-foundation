package com.vihanga.exercise.external;

public class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("Turkey gobble.........");
    }

    @Override
    public void fly() {
        System.out.println("turkey  to fly small distance");
    }
}
