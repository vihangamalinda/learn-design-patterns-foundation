package com.vihanga.example.behaviour.quack;

public class CanQuack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("I can Quack :)");
    }
}
