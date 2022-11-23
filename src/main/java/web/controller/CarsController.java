package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarsController {

    private final CarService carService;

    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String printTableWithCars(@RequestParam(value = "count", required = false, defaultValue = "5")
                                     String count, ModelMap model) {
        model.addAttribute("cars", carService.getCars(count));
        return "cars";
    }
}
