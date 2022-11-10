package com.vihanga.exercise;

import com.vihanga.exercise.observer.SimpleObserver;
import com.vihanga.exercise.subject.SimpleSubject;

public class TestObserver {
    public static void main(String[] args) {
        SimpleSubject simpleSubject = new SimpleSubject();

        SimpleObserver simpleObserver01 = new SimpleObserver(simpleSubject);
        SimpleObserver simpleObserver02 = new SimpleObserver(simpleSubject);
        SimpleObserver simpleObserver03 = new SimpleObserver(simpleSubject);
        SimpleObserver simpleObserver04 = new SimpleObserver(simpleSubject);

        simpleSubject.notifyObserver();
        simpleSubject.removeObserver(simpleObserver02);
        simpleSubject.notifyObserver();
        simpleSubject.setValue(3);

    }
}
