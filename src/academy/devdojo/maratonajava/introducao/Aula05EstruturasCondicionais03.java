package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args){
        // doar se salario > 5000
        double salary = 6000;

        // (condiçao) ? verdadeiro : falso;
        String result = (salary > 5000) ? "Eu vou doar 500 pro DevDojo" : "Ainda não tenho condições de doar";

        System.out.println(result);
    }
}
