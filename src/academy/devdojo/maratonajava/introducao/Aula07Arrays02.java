package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args){
        // byte, short, int, long, float e double inicia com 0
        // char 'u\0000' inicia com ''
        // String inicia com null
        String[] names = new String [4];
        names[0] = "Goku";
        names[1] = "Kurosaki";
        names[2] = "Luffy";
        names[3] = "Sasuke";
        for (int i = 0; i < names.length ; i++) {
            System.out.println(names[i]);
        }
    }
}
