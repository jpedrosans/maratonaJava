package academy.devdojo.maratonajava.introducao;
/*
Prática

Crie variáveis para os campos descritos entra <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereco>,
confirmo que recebi o salário de <salario>, na data <data>
 */

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {

        String nome = "João Pedro";
        String endereco = "Rua das Oliveiras, número 10";
        double salario = 3900.00;
        String data = "10/09/2026";
        String mensagem = "Eu " + nome + ", morando no endereço " + endereco + ", confirmo que recebi o salário de " + salario + ", na data " + data;

        System.out.println(mensagem);
        System.out.println("Eu " + nome + ", morando no endereço " + endereco + ", confirmo que recebi o salário de " + salario + ", na data " + data);
    }
}
