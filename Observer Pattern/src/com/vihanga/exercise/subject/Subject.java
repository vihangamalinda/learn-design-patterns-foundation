package com.vihanga.exercise.subject;

import com.vihanga.exercise.observer.Observer;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
