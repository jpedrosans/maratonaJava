package academy.devdojo.maratonajava.javacore.Lclassesabstratas.teste;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000);
        System.out.println(gerente);
        Desenvolvedor desenvolvedor = new Desenvolvedor("João", 12000);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}
