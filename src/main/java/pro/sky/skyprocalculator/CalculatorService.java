package pro.sky.skyprocalculator;

import org.springframework.stereotype.Service;


@Service
public class CalculatorService {

    public String plusCalculator(int a, int b) {
        int c = a + b;
        return String.valueOf(c);
    }


    public String minusCalculator(int a, int b) {
        int c = a - b;
        return String.valueOf(c);
    }


    public String multiplyCalculator(int a, int b) {
        int c = a * b;
        return String.valueOf(c);
    }


    public String divideCalculator(int a, int b) {
        if (b == 0) {
            return "На ноль делить нельзя!";
        }
        int c = a / b;
        return String.valueOf(c);
    }
}
