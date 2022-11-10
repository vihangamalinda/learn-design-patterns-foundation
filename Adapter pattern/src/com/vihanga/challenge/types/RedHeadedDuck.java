package com.vihanga.challenge.types;

import com.vihanga.challenge.Duck;

public class RedHeadedDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("RedHeaded Duck Quack");
    }

    @Override
    public void fly() {
        System.out.println("RedHeaded Duck Fly");
    }

}
