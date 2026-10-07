package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTeste01 {
    public static void main(String[] args) {
        Local endereco1 = new Local("Konoha");
        Local endereco2 = new Local("Vila da Areia");
        Seminario seminario1 = new Seminario("A obra do pain", endereco2);
        Seminario seminario2 = new Seminario("A obra do deidara", endereco1);
        Aluno aluno1 = new Aluno("Nagato", 48, seminario1);
        Aluno aluno2 = new Aluno("Madara", 68, seminario1);
        Seminario[] seminarios = {seminario1, seminario2};
        Professor professor1 = new Professor("Jiraya", "Estudos para livro", seminarios);
        Aluno[] alunos = {aluno1, aluno2};
        seminario1.setAlunos(alunos);

        System.out.println("---Professor---");
        professor1.imprime();
        System.out.println("---Seminario---");
        seminario1.imprime();
    }
}
