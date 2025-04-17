package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args){
        // + - * /
        int num01 = 10;
        double num02 = 20;
        double result = num02+num01;
        System.out.println(result);

        // %
        int rest = 20 % 2;
        System.out.println(rest);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezigualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;

        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualVinte);
        System.out.println(isDezigualDez);
        System.out.println(isDezDiferenteDez);

        // &&(AND) || (or) !

        int age = 29;
        float salario = 3500.0f;
        boolean isDentroDaLeiMaiorQueTrinta = age > 30 && salario > 4612;
        boolean isDentroDaleiMenorQueTrinta = age < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta "+isDentroDaleiMenorQueTrinta);

    }
}
