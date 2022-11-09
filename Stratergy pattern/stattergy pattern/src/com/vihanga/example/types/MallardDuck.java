package com.vihanga.example.types;

import com.vihanga.example.Duck;
import com.vihanga.example.behaviour.fly.FlyBehaviour;
import com.vihanga.example.behaviour.quack.QuackBehaviour;

public class MallardDuck extends Duck {


    public MallardDuck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
        super(flyBehaviour, quackBehaviour);
    }




    @Override
    public void display() {
        System.out.println("I'm a mallard Duck");
    }


}
