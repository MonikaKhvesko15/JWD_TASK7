package com.epam.task7.logic.director;

import com.epam.task7.entity.Cone;
import com.epam.task7.entity.Point;

import java.util.List;


public interface Director {
    List<Cone> run() throws Exception;
}
