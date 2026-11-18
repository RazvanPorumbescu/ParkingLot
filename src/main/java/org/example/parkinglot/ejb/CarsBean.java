@Stateless

package org.example.parkinglot.ejb;

import jakarta.ejb.Local;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.example.parkinglot.entities.Car;
import java.util.List;
import java.util.logging.Logger;

public class CarsBean {
    private static final Logger Log=Logger.getLogger(CarsBean.class.getName());
@PersistenceContext
EntityManager entityManager;
    public List<Car> findAllCars() {
        TypedQuery<Car> query = entityManager.createQuery("SELECT c FROM Car c", Car.class);
        return query.getResultList();
    }
}

