package com.epam.task7.logic.parser;

import com.epam.task7.entity.Point;

import java.util.ArrayList;
import java.util.List;

public class StringParser implements Parser{
    @Override
    public List<Point> parseString(String line) {
        String[] strings = line.split("[(); ]+");
        List<Point> points = new ArrayList<>();
      for (int i = 1; i < strings.length; i = i + 3) {
           points.add(new Point(Integer.parseInt(strings[i]),
                                Integer.parseInt(strings[i+1]),
                                Integer.parseInt(strings[i+2])));
        }

        return points;
    }
}
