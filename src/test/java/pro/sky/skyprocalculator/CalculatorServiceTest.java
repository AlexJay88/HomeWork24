package pro.sky.skyprocalculator;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorServiceTest {
    private final   CalculatorService calculatorService=new CalculatorService();
    @Test
    public void shouldCorrectlyCalculateSum(){
        int num1=10;
        int num2=20;
        int expectedSum=num1+num2;
        Integer actualSum = calculatorService.sumCalculator(num1, num2);
        Assertions.assertEquals(expectedSum,actualSum);

    }
    @Test
    public void shouldCorrectlyCalculateSubtract(){
        int num1=10;
        int num2=20;
        int expectedSum=num1-num2;
        Integer actualSum = calculatorService.minusCalculator(num1, num2);
        Assertions.assertEquals(expectedSum,actualSum);



    }

    @Test
    public void shouldCorrectlyCalculateMultiply(){
        int num1=10;
        int num2=20;
        int expectedSum=num1*num2;
        Integer actualSum = calculatorService.multiplyCalculator(num1, num2);
        Assertions.assertEquals(expectedSum,actualSum);




    }


        @Test
    public void shouldThrowExceptionWhenSecondNumberIsZero(){
        int num1=10;
        int num2=0;
        Assertions.assertThrows(IllegalArgumentException.class,() ->
                    calculatorService.divideCalculator(num1,num2));

                }}




