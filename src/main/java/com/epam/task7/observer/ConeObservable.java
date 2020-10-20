package com.epam.task7.observer;

import com.epam.task7.entity.Cone;
import com.epam.task7.logic.calculator.characteristic.Calculator;
import com.epam.task7.logic.calculator.characteristic.GeometricCalculator;

import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConeObservable extends Cone implements Observer, Observable {
    private List<Observer> observers=new ArrayList<>();

    private Map<Integer, Parameter> map = new HashMap<>();

    private GeometricCalculator calculator;

    private void Observer() {
        super();
        calculator = new Calculator();
    }

    void Observer(Calculator calculator) {
        super();
        this.calculator = calculator;
    }



    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notify(ConeObservable cone) {
        double area = calculator.calculateArea(cone);
        double volume = calculator.calculateVolume(cone);

        map.put(cone.getId(), new Parameter(area, volume));
    }

    public interface Observer {
        void update(String event);
    }




}
