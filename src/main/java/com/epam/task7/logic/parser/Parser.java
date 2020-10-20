package com.epam.task7.logic.parser;

import com.epam.task7.entity.Point;

import java.util.List;

public interface Parser {
    List<Point> parseString (String line);
}
