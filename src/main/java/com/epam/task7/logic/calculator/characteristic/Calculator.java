package com.epam.task7.logic.calculator.characteristic;

import com.epam.task7.entity.Cone;

public class Calculator implements GeometricCalculator{

    public static final double PI = 3.14159;

    @Override
    public double calculateVolume(Cone cone) {
        double r = cone.getRadius();
        double h = cone.getHeight();
        double coneVolume = (1.0/ 3) * PI * Math.pow(r, 2) * h;
        return coneVolume;
    }

    @Override
    public double calculateArea(Cone cone) {
        double r = cone.getRadius();
        double l = cone.getSlantHeight();
        double area = PI * Math.pow(r, 2) + PI * r * l;
        return area;
    }
}
