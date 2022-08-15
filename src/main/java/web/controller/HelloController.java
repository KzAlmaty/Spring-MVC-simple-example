package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
@Controller
public class HelloController {

    private final CarService carService;

    public HelloController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/")
	public String printWelcome() {
		return "index";
	}

    @GetMapping(value = "/cars")
    public String goToCars(@RequestParam(name = "count") int count, Model model) {
        model.addAttribute("car", carService.getCars(count));
        return "cars";
    }

	
}