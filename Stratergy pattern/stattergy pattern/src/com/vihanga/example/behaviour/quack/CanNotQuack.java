package com.vihanga.example.behaviour.quack;

public class CanNotQuack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Sorry I can not Quack :(");
    }
}
