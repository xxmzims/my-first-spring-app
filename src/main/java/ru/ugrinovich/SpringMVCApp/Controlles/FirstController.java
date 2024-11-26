package ru.ugrinovich.SpringMVCApp.Controlles;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/first")
public class FirstController {
    @GetMapping("/hello")
    public String helloPage(@RequestParam(value = "name", required = false) String name,
                            @RequestParam(value = "surname",  required = false) String surname,
                            Model model) {

        model.addAttribute("message", "Hello," + name + " " + surname);
//        System.out.println("Hello, " + name + " " + surname);
        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String goodbyePage() {
        return "first/goodbye";
    }
    @GetMapping("/calculator")
    public  String calculatorPage(@RequestParam(value = "a") String firstNumber,
                                  @RequestParam(value = "b") String secondNumber,
                                  @RequestParam(value ="action") String action,
                                  Model model){
        int a = Integer.parseInt(firstNumber);
        int b = Integer.parseInt(secondNumber);
        double res;
        switch (action){
            case "multiplication":
                res = a * b;
                break;
            case "addition":
                res = a + b;
                break;
            case "subtraction":
                res = a - b;
                break;
            case "division":
                res = a /(double) b;
                break;
            default:
                res = 0;
                break;
        }
        model.addAttribute("res", "calculation result: " + res);
        return "first/calculator";
    }
}
