package academy.devdojo.maratonajava.javacore.Hheranca.teste;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTeste01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        Pessoa pessoa = new Pessoa("Madara Uchiha");
        endereco.setRua("Rua 3");
        endereco.setCep("012345-6789");
        pessoa.setCpf("666666");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        System.out.println("-----------");

        Funcionario funcionario = new Funcionario("Sasuke Uchiha");
        funcionario.setCpf("999999");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(5600);

        funcionario.imprime();
    }
}
