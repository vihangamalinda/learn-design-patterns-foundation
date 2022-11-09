package com.vihanga.example.types;

import com.vihanga.example.Duck;
import com.vihanga.example.behaviour.fly.FlyBehaviour;
import com.vihanga.example.behaviour.quack.QuackBehaviour;

public class DecoyDuck extends Duck {


    public DecoyDuck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
        super(flyBehaviour, quackBehaviour);
    }





    @Override
    public void display() {
        System.out.println("I'm a Decoy duck");
    }


}
