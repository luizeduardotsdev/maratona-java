package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain;

public class Calculator {

    public void sumTwoNumbers() {
        System.out.println(10 + 10);
    }

    public void subtractTwoNumbers() {
        System.out.println(21 - 2);
    }

    public void multiplicateTwoNumbers(int num1, double num2) {
        System.out.println(num1 * num2);
    }

    public double divideTwoNumbers(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public double divideTwoNumbers02(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        }
        return 0;
    }

    public void imprimeDivisao(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Não existe divisao por zero");
            return;
        }
        System.out.println(num1 / num2);
    }

    public void alternTwoNumbers(int number1, int number2){
        number1 = 99;
        number2 = 33;
        System.out.println("Dentro do alternTwoNumbers");
        System.out.println("Num1 " + number1);
        System.out.println("Num2 " + number2);
    }
}
