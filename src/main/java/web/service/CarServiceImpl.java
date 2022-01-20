package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService{
    @Override
    public List<Car> getCars(List cars, int num){
        List<Car> carList = new ArrayList<>();
        for (int i = 0; i < Math.min(num, cars.size()); i++) {
            carList.add((Car) cars.get(i));
        }
        return carList;
    }
}
