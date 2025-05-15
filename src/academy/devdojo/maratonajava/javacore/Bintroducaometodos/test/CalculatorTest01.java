package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Calculator;

public class CalculatorTest01 {
    public static void main(String[] args){
        Calculator calc = new Calculator();
        calc.sumTwoNumbers();
        System.out.println("Finalizando CalculatorTest01");
        calc.subtractTwoNumbers();
    }
}
