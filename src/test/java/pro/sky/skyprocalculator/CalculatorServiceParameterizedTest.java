package pro.sky.skyprocalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorServiceParameterizedTest {
    private final   CalculatorService calculatorService=new CalculatorService();

    private static Stream<Arguments>argumentProviderForSum(){
        return Stream.of(
                Arguments.of(20,10,30),
                Arguments.of(-15,-5,-20),
                Arguments.of(10,0,10),
                Arguments.of(0,20,20),
                Arguments.of(100,10,110));
    }
    private static Stream<Arguments>argumentProviderForSubtract(){
        return Stream.of(
                Arguments.of(30,10,20),
                Arguments.of(10,5,5),
                Arguments.of(10,0,10),
                Arguments.of(100,80,20),
                Arguments.of(100,10,90));
    }

    private static Stream<Arguments>argumentProviderForMultiply() {
        return Stream.of(
                Arguments.of(3, 10, 30),
                Arguments.of(10, 5, 50),
                Arguments.of(10, 0, 0),
                Arguments.of(1, 80, 80),
                Arguments.of(20, 10, 200));


    }

    private static Stream<Arguments>argumentProviderForDivide() {
        return Stream.of(
                Arguments.of(30, 10, 3),
                Arguments.of(10, 5, 2),
                Arguments.of(100, 10, 10),
                Arguments.of(40, 8, 5),
                Arguments.of(20, 10, 2));


    }


    @ParameterizedTest
    @MethodSource("argumentProviderForSum")
    public void shouldCorrectlyCalculateSum(int num1,int num2,int expectedSum){

        Integer actualSum = calculatorService.sumCalculator(num1, num2);
        Assertions.assertEquals(expectedSum,actualSum);

    }
    @ParameterizedTest
    @MethodSource("argumentProviderForSubtract")
    public void shouldCorrectlyCalculateSubtract(int num1,int num2,int expectedSum){

        Integer actualSum = calculatorService.minusCalculator(num1, num2);
        Assertions.assertEquals(expectedSum,actualSum);

    }
    @ParameterizedTest
    @MethodSource("argumentProviderForMultiply")
    public void shouldCorrectlyCalculateMultiply(int num1,int num2,int expectedSum){

        Integer actualSum = calculatorService.multiplyCalculator(num1, num2);
        Assertions.assertEquals(expectedSum,actualSum);

    }
    @ParameterizedTest
    @MethodSource("argumentProviderForDivide")
    public void shouldCorrectlyCalculateDivide(int num1,int num2,int expectedSum){

        Double actualSum = calculatorService.divideCalculator(num1, num2);
        Assertions.assertEquals(expectedSum,actualSum);

        }



}