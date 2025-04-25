package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    // dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
    // Condiçao é que valorParcela >= 1000
    public static void main(String[] args){
        double totalValue = 30000;
        for (int parcela = 1; parcela <= totalValue; parcela++){
            double valorParcela = totalValue / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela " +parcela+ " R$" +valorParcela);
        }

    }
}
