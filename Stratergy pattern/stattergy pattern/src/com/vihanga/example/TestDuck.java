package com.vihanga.example;

import com.vihanga.example.behaviour.fly.CanFly;
import com.vihanga.example.behaviour.fly.CanNotFly;
import com.vihanga.example.behaviour.quack.CanNotQuack;
import com.vihanga.example.behaviour.quack.CanQuack;
import com.vihanga.example.types.DecoyDuck;
import com.vihanga.example.types.RedHeadedDuck;
import com.vihanga.example.types.RubberDuck;

public class TestDuck {
    public static void main(String[] args) {
        System.out.println("Decoy Duck");
        DecoyDuck decoyDuck = new DecoyDuck(new CanFly(), new CanNotQuack());
        decoyDuck.performFly();
        decoyDuck.performQuack();
        decoyDuck.display();
        decoyDuck.swim();
        System.out.println("Changing Fly Types and Quack Type");
        decoyDuck.setFlyBehaviour(new CanNotFly());
        decoyDuck.setQuackBehaviour(new CanNotQuack());
        decoyDuck.performFly();
        decoyDuck.performQuack();
        System.out.println("");

        System.out.println("Red Headed Duck");
        RedHeadedDuck redHeadedDuck = new RedHeadedDuck(new CanFly(),new CanQuack());
        redHeadedDuck.performFly();
        redHeadedDuck.performQuack();
        redHeadedDuck.swim();
        redHeadedDuck.display();
        System.out.println("");

        System.out.println("Rubber Duck");
        RubberDuck rubberDuck = new RubberDuck(new CanNotFly(),new CanNotQuack());
        rubberDuck.performFly();
        rubberDuck.performQuack();
        rubberDuck.swim();
        rubberDuck.display();


    }
}
