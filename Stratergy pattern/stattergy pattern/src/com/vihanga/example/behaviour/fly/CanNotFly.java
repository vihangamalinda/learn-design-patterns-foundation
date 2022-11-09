package com.vihanga.example.behaviour.fly;

public class CanNotFly implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("Sorry I can no fly :( ");
    }
}
