package com.epam.task7.repository.specification;

import com.epam.task7.entity.Cone;

public class ConeSpecificationById implements ConeSpecification{
        private int desiredId;

    public ConeSpecificationById(int desiredId) {
            super();
            this.desiredId = desiredId;
        }

        @Override
        public boolean specified(Cone cone) {
           return desiredId==cone.getId();
        }
}
