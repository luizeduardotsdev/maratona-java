package academy.devdojo.maratonajava.introducao;
/*
Prática

Crie variáveis para os campos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no <endereço>
confirmo que recebi o salário de <salario>, na data <data>
* */
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args){
        String nome = "Luiz";
        String address = "Bairro feliz";
        String dataPayment = "17/04/2025";
        double salary = 4000.20;

        System.out.println("Eu "+nome+" ,morando no "+address+" confirmo que recebi o salario de "+salary+" na data "+dataPayment);
    }
}
