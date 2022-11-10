package com.vihanga.challenge;

import com.vihanga.challenge.adapter.DroneAdapter;
import com.vihanga.challenge.external.types.SuperDrone;
import com.vihanga.challenge.types.RedHeadedDuck;

public class TestDuckSimulator {
    public static void main(String[] args) {
        RedHeadedDuck redHeadedDuck = new RedHeadedDuck();
        testDuck(redHeadedDuck);

        DroneAdapter droneAdapter = new DroneAdapter(new SuperDrone());
        testDuck(droneAdapter);
    }

    public static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
        System.out.println("");
    }
}
