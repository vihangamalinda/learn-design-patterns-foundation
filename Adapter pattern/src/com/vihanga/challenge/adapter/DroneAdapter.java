package com.vihanga.challenge.adapter;

import com.vihanga.challenge.Duck;
import com.vihanga.challenge.external.Drone;

public class DroneAdapter implements Duck {
    private Drone drone;

    public DroneAdapter(Drone drone){
        this.drone = drone;
    }

    @Override
    public void quack() {
        // Relevant to drone sound
        this.drone.beep();
    }

    @Override
    public void fly() {
//    Relevant to how drone will be flying
        this.drone.spin_rotators();
        this.drone.take_off();
    }
}
