package pro.sky.skyprocalculator;

import org.springframework.stereotype.Service;
@Service
public  class CalculatorService implements pro.sky.skyprocalculator.CalculatorInterface {
@Override
    public String calculator() {
        return "Добро пожаловать в калькулятор";
    }


    public Integer sumCalculator(Integer num1,Integer num2) {
        return num1 + num2;
    }

    public Integer minusCalculator(Integer num1,Integer num2) {
        return num1 - num2;
    }

    public Integer multiplyCalculator(Integer num1,Integer num2) {
        return num1 * num2;
    }

    public Double divideCalculator(Integer num1,Integer num2) {
        if (num2==0){
           throw new IllegalArgumentException();

        }
        return (double) num1/num2;


    }
}
