package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // Condição é que valorParcela >= 1000
        float valorCarro = 30000;
        for (int i = 1; i <= valorCarro; i++) {
            float valorParcela = valorCarro / i;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println(i + "x R$" + valorParcela);
        }
    }
}