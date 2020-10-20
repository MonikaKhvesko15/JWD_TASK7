package com.epam.task7.repository;

import com.epam.task7.entity.Cone;
import com.epam.task7.repository.specification.ConeSpecification;

import java.util.List;

public interface ConeRepository {

    void addCone(Cone cone);

    void removeCone(Cone cone);

    List<Cone> query(ConeSpecification specification);

}
