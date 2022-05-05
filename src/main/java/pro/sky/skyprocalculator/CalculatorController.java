package pro.sky.skyprocalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping(path = "/calculator")
    public String answerCalculator() {
        return calculatorService.answerCalculator();
    }

    @GetMapping(path = "/calculator/plus")
    public String plusCalculator(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        return calculatorService.plusCalculator(a, b);
    }

    @GetMapping(path = "/calculator/minus")
    public String minusCalculator(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        return calculatorService.minusCalculator(a, b);
    }

    @GetMapping(path = "/calculator/multiply")
    public String multiplyCalculator(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        return calculatorService.multiplyCalculator(a, b);
    }

    @GetMapping(path = "/calculator/divide")
    public String divideCalculator(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        return calculatorService.divideCalculator(a, b);
    }
}

