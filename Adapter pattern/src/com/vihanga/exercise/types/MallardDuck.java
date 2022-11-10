package com.vihanga.exercise.types;

import com.vihanga.exercise.Duck;

public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Mallard Duck quack");

    }

    @Override
    public void fly() {
        System.out.println("Mallard duck fly");

    }
}
