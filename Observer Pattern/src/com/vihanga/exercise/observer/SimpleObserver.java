package com.vihanga.exercise.observer;

import com.vihanga.exercise.subject.Subject;

public class SimpleObserver implements Observer{

    private int value ;
    private Subject subject;

   public SimpleObserver(Subject subject){
       this.subject = subject;
       subject.registerObserver(this); //Registering ths instance on simple subject

   }
    @Override
    public void update(int value) {
       this.value = value;
        System.out.println("Subject have updated this Object:"+this.toString());
        display();
    }

    private void display(){
        System.out.println("The updated value:"+this.value);
    }
}
