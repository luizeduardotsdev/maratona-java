package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        double totalValue = 30000;
        for (int parcela = (int) totalValue; parcela >= 1 ; parcela--) {
            double valorParcela = totalValue / parcela;
            if (valorParcela < 1000){
                continue;
            }
            System.out.println("Parcela " +parcela+ " R$" +valorParcela);
            
        }
    }
}
