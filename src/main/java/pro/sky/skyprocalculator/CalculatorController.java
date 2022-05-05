package pro.sky.skyprocalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String answerCalculator() {
        return "Добро пожаловать в калькулятор!";
    }

    @GetMapping(path = "/plus")
    public String plusCalculator(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        return a + " + " + b + " = " + calculatorService.plusCalculator(a, b);
    }

    @GetMapping(path = "/minus")
    public String minusCalculator(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        return a + " - " + b + " = " + calculatorService.minusCalculator(a, b);
    }

    @GetMapping(path = "/multiply")
    public String multiplyCalculator(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        return a + " * " + b + " = " + calculatorService.multiplyCalculator(a, b);
    }

    @GetMapping(path = "/divide")
    public String divideCalculator(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        return a + " / " + b + " = " + calculatorService.divideCalculator(a, b);
    }
}

