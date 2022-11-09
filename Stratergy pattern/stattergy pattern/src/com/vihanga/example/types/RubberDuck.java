package com.vihanga.example.types;

import com.vihanga.example.Duck;
import com.vihanga.example.behaviour.fly.FlyBehaviour;
import com.vihanga.example.behaviour.quack.QuackBehaviour;

public class RubberDuck extends Duck {


    public RubberDuck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
        super(flyBehaviour, quackBehaviour);
    }




    @Override
    public void display() {
        System.out.println("Im a Rubber Duck.");
    }


}
