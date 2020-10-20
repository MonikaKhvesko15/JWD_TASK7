package com.epam.task7.repository;

import com.epam.task7.entity.Cone;
import com.epam.task7.repository.specification.ConeSpecification;
import org.apache.log4j.Logger;
import java.util.List;


public class ConeRepositoryImpl implements ConeRepository {
    private List<Cone> cones;

    private static final Logger LOGGER = Logger.getLogger(ConeRepositoryImpl.class);

    public ConeRepositoryImpl(List<Cone> cones) {
        this.cones = cones;
    }

    @Override
    public void addCone(Cone cone) {
        cones.add(cone);
    }

    @Override
    public void removeCone(Cone cone) {
        boolean result = cones.remove(cone);
        if (!result) {
            LOGGER.warn("this book is not exist");
        }
    }

    @Override
    public List<Cone> query(ConeSpecification specification) {
        return null;
    }
}
