package com.vihanga.challenge.external.types;

import com.vihanga.challenge.external.Drone;

public class SuperDrone  implements Drone {
    @Override
    public void beep() {
        System.out.println("Super drone Beeps");
    }

    @Override
    public void spin_rotators() {
        System.out.println("Rotating to take off......");
    }

    @Override
    public void take_off() {
        System.out.println("Take off.....");
    }
}
