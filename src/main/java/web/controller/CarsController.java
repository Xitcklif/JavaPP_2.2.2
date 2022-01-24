package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;

@Controller
public class CarsController {

    CarService carService = new CarServiceImpl();

    @GetMapping(value = "/cars")
    public String printCars(
            @RequestParam(value = "count", required = false, defaultValue = "5") Integer count,
            ModelMap model) {

        model.addAttribute("cars", carService.getCars(count));
        return "cars";
    }
}
