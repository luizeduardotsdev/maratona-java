package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Calculator;

public class CalculatorTest04 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 1;
        int b = 2;
        calculator.alternTwoNumbers(a, b);
        System.out.println("Dentro do CalculatorTest04");
        System.out.println("Num1 " + a);
        System.out.println("Num2 "+ b);
    }
}
