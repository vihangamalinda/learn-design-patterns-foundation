package com.vihanga.exercise.adapter;

import com.vihanga.exercise.Duck;
import com.vihanga.exercise.external.Turkey;

public class TurkeyAdapter implements Duck {

    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        this.turkey.gobble();
    }

    @Override
    public void fly() {
//        Adapting turkeys flying to duck flying, as turkeys can not fly much.
       for(int i=0;i<5;i++) {
           this.turkey.fly();
       }

    }
}
