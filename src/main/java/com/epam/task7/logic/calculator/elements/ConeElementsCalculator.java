package com.epam.task7.logic.calculator.elements;

import com.epam.task7.entity.Point;
import com.epam.task7.logic.calculator.elements.ElementsCalculator;


public class ConeElementsCalculator implements ElementsCalculator {
    @Override
    public double calculateHeight(Point apex, Point baseRadius) {

        Double height=Math.sqrt(Math.pow(apex.getX()-baseRadius.getX(), 2)+Math.pow(apex.getY()-baseRadius.getY(), 2)+Math.pow(apex.getZ()-baseRadius.getZ(), 2));
        return height;
    }

    @Override
    public double calculateRadius(Point baseRadius, Point pointRadius) {
        Double radius=Math.sqrt(Math.pow(baseRadius.getX()-pointRadius.getX(), 2)+Math.pow(baseRadius.getY()-pointRadius.getY(), 2)+Math.pow(baseRadius.getZ()-pointRadius.getZ(), 2));
        return radius;
    }

    @Override
    public double calculateSlantHeight(Point apex, Point pointRadius) {
        Double slantHeight=Math.sqrt(Math.pow(apex.getX()-pointRadius.getX(), 2)+Math.pow(apex.getY()-pointRadius.getY(), 2)+Math.pow(apex.getZ()-pointRadius.getZ(), 2));
        return slantHeight;
    }
}
