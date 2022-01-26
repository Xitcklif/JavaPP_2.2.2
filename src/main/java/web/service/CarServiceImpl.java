package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    private final List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("Reno","Blue","Andrey"));
        cars.add(new Car("Lada","Red","Vladimir"));
        cars.add(new Car("Porshe","Gold","Alexey"));
        cars.add(new Car("Toyota","White","Sergey"));
        cars.add(new Car("BMW","Black","Nikolay"));
    }

    @Override
    public List<Car> getCars(int num){
        List<Car> carList = new ArrayList<>();
        for (int i = 0; i < Math.min(num, cars.size()); i++) {
            carList.add((Car) cars.get(i));
        }
        return carList;
    }
}
