package com.vihanga.example;

import com.vihanga.example.behaviour.fly.FlyBehaviour;
import com.vihanga.example.behaviour.quack.QuackBehaviour;

public  abstract class Duck {
    protected FlyBehaviour flyBehaviour;
    protected QuackBehaviour quackBehaviour;

    public Duck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
        this.flyBehaviour = flyBehaviour;
        this.quackBehaviour = quackBehaviour;
    }

   protected void swim(){
       System.out.println("I can swim. All the ducks can, even the decoy ones.... :)");
   };

   protected abstract void display();

   protected void setFlyBehaviour(FlyBehaviour flyBehaviour){
       this.flyBehaviour = flyBehaviour;
   }
   protected void setQuackBehaviour(QuackBehaviour quackBehaviour){
       this.quackBehaviour = quackBehaviour;
   }

   protected void performFly(){
         this.flyBehaviour.fly();
     };
   protected void performQuack(){
         this.quackBehaviour.quack();
     };

    @Override
    public String toString() {
        return "Duck{" +
                "flyBehaviour=" + flyBehaviour +
                ", quackBehaviour=" + quackBehaviour +
                '}';
    }
}
