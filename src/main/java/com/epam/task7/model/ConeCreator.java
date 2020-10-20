package com.epam.task7.model;

import com.epam.task7.entity.Cone;
import com.epam.task7.entity.Point;
import com.epam.task7.logic.calculator.elements.ElementsCalculator;
import com.epam.task7.logic.calculator.elements.ConeElementsCalculator;

import java.util.List;


public class ConeCreator {
    public Cone createCone(List<Point> points) {
        Point apex = points.get(0);
        Point baseRadius = points.get(1);
        Point pointRadius = points.get(2);

        ElementsCalculator coneElements = new ConeElementsCalculator();
        double height = coneElements.calculateHeight(apex, baseRadius);
        double radius = coneElements.calculateRadius(baseRadius, pointRadius);
        double slantHeight = coneElements.calculateSlantHeight(apex, pointRadius);

        Cone cone = new Cone(height, radius, slantHeight, apex, baseRadius, pointRadius);

        return cone;
    }
}
