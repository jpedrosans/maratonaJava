package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // doar se salario > 5000
        double salario = 3000;
        String mensagemDoar = "Eu vou doar 500";
        String mensaemNaoDoar = "Ainda não consigo doar";
        //String resultado = (condicao) ? verdadeiro : falso;
        String resultado = salario > 5000 ? mensagemDoar : mensaemNaoDoar;
        System.out.println(resultado);
        // System.out.println(salario > 5000 ? mensagemDoar : mensaemNaoDoar);
        // System.out.println(salario > 5000 ? "Eu vou doar 500" : "Ainda não consigo doar");
    }
}
