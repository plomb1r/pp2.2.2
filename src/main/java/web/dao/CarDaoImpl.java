package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    @Override
    public List<Car> getCars(String count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("bmw", "123", "blue"));
        cars.add(new Car("renault", "235", "red"));
        cars.add(new Car("lada", "546", "green"));
        cars.add(new Car("volvo", "879", "white"));
        cars.add(new Car("audi", "111", "black"));
        if (count != null) {
            cars = cars.stream().limit(Integer.parseInt(count)).collect(Collectors.toList());
        }
        return cars;
    }
}
