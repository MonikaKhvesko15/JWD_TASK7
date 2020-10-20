package com.epam.task7.logic.calculator.elements;

import com.epam.task7.entity.Point;

public interface ElementsCalculator {
    double calculateHeight(Point apex, Point baseRadius);
    double calculateRadius(Point baseRadius, Point pointRadius);
    double calculateSlantHeight(Point apex,Point pointRadius);
}
