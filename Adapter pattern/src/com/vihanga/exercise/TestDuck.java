package com.vihanga.exercise;

import com.vihanga.exercise.adapter.TurkeyAdapter;
import com.vihanga.exercise.external.WildTurkey;
import com.vihanga.exercise.types.RedHeadedDuck;

public class TestDuck {
    public static void main(String[] args) {
        RedHeadedDuck redHeadedDuck = new RedHeadedDuck();
        testDuckTest(redHeadedDuck);


        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(new WildTurkey());
        testDuckTest(turkeyAdapter);
    }

    private static void testDuckTest(Duck duck){
        duck.fly();
        duck.quack();
        System.out.println("");
    }
}
