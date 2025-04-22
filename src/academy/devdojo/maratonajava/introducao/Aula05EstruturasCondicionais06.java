package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args){
        // Utilizando switch e dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        // considerando 1 como domingo
        byte day = 2;
        switch (day){
            case 1:
                System.out.println("Final de semana");
                break;
            case 7:
                System.out.println("Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
