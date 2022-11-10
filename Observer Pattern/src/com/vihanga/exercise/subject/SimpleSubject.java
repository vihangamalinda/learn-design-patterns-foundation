package com.vihanga.exercise.subject;

import com.vihanga.exercise.observer.Observer;

import java.util.ArrayList;

public class SimpleSubject implements Subject{

    private ArrayList<Observer> observerList;
    private int value;

    public SimpleSubject() {
        this.observerList = new ArrayList<>();
        this.value = 0;
    }

    @Override
    public void registerObserver(Observer observer) {
        System.out.println("adding Observer");
        this.observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        System.out.println("Removing Observer");
    this.observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        System.out.println("Called received...");
        this.observerList.stream().forEach(observer -> observer.update(this.value));
    }
    public void setValue(int value){
        System.out.println("Setting the new value");
        this.value = value;
        notifyObserver();
    }



}
