package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    // Imprima os primeiros 25 numeros de um dado valor.
    public static void main(String[] args){
        int maxValue = 50;
        for (int i = 0; i <= maxValue; i++){
            if (i > 25) {
                break;
            }
            System.out.println(i);
        }
    }
}
