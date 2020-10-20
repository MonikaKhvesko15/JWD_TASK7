package com.epam.task7.logic.calculator.characteristic;

import com.epam.task7.entity.Cone;

public interface GeometricCalculator {
    double calculateVolume(Cone cone);
    double calculateArea(Cone cone);
}
