package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    CarService carService = new CarServiceImpl();

    @GetMapping(value = "/cars")
    public String printCars(
            @RequestParam(value = "count", required = false) Integer count,
            ModelMap model) {

        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Reno", "Blue", "Andrey"));
        cars.add(new Car("Lada", "Red", "Vladimir"));
        cars.add(new Car("Porshe", "Gold", "Alexey"));
        cars.add(new Car("Toyota", "White", "Sergey"));
        cars.add(new Car("BMW", "Black", "Nikolay"));

        model.addAttribute("cars",
                carService.getCars(cars, count == null? cars.size() : count));

        return "cars";
    }
}
