package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        // dado um determinado salário anual, qual o valor deve ser pago
        double salario = 70000;
        double percTaxa;
        if (salario < 34713) {
            percTaxa = 9.70;
        } else if (salario < 68508) {
            percTaxa = 37.35;
        } else {
            percTaxa = 49.50;
        }
        double valorPago = percTaxa / 100 * salario;
        System.out.println("Sua taxa é de: " + percTaxa + "%, logo você deverá pagar: R$ " + valorPago);
    }
}
