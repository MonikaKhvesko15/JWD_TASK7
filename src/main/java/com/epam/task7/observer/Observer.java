package com.epam.task7.observer;

public interface Observer {
    void update();
    void notify(ConeObservable cone);
}
