package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args){
        double anualSalary = 25000;
        double firstTax = 9.70 / 100;
        double secondTax = 37.35 / 100;
        double thirdTax = 49.50 / 100;
        double finalValue;

        if (anualSalary <= 34712){
            finalValue = anualSalary * firstTax;
        }else if(anualSalary >= 34713 && anualSalary <= 68507){
            finalValue = anualSalary * secondTax;
        }else{
            finalValue = anualSalary * thirdTax;
        }
        System.out.println(finalValue);
    }
}
