package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("João Pedro");
        funcionario.setIdade(25);
        funcionario.setSalarios(new double[]{1500, 2500, 3500});
        funcionario.imprimirDados();
        System.out.println("Média " + funcionario.getMedia());
    }
}
