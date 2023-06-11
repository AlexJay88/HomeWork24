package pro.sky.skyprocalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/calculator")
public class CalculatorController {
    private final pro.sky.skyprocalculator.CalculatorService calculatorService;

    public CalculatorController(pro.sky.skyprocalculator.CalculatorService calculatorService) {
        this.calculatorService = calculatorService;

    }

    @GetMapping
    public String calculator() {
        return calculatorService.calculator();
    }

    @GetMapping(path = "/plus")
    public String plusCalculator(@RequestParam Integer num1, @RequestParam Integer num2) {
        return num1+" + "+num2+" = "+calculatorService.sumCalculator(num1,num2);

        }


    @GetMapping(path = "/minus")
    public String minusCalculator(@RequestParam Integer num1, @RequestParam Integer num2) {
        return num1+" - "+num2+" = "+calculatorService.minusCalculator(num1,num2);
        }


    @GetMapping(path = "/multiply")
    public String multiplyCalculator(@RequestParam Integer num1, @RequestParam Integer num2) {
        return num1+" * "+num2+" = "+calculatorService.multiplyCalculator(num1,num2);
        }


    @GetMapping(path = "/divide")
    public String divideCalculator(@RequestParam Integer num1, @RequestParam Integer num2) {
        return num1+" / "+num2+" = "+calculatorService.divideCalculator(num1,num2);
    }



    }


