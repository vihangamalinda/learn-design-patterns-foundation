package com.vihanga.exercise.types;

import com.vihanga.exercise.Duck;

public class RedHeadedDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("Red Headed Duck quack");
    }

    @Override
    public void fly() {
        System.out.println("Red headed duck fly");

    }
}
