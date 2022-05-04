package pro.sky.skyprocalculator;

import org.springframework.web.bind.annotation.RequestParam;

public class CalculatorService {
    public String answerCalculator() {
        return "Добро пожаловать в калькулятор!";
    }

    public String plusCalculator(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        int c = a + b;
        return a + " + " + b + " = " + c;
    }


    public String minusCalculator(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        int c = a - b;
        return a + " - " + b + " = " + c;
    }


    public String multiplyCalculator(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        int c = a * b;
        return a + " * " + b + " = " + c;
    }


    public String divideCalculator(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        if (b == 0) {
            return "На ноль делить нельзя!";
        }
        int c = a / b;
        return a + " / " + b + " = " + c;
    }

}
