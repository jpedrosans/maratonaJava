package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Mestre Kame";
        professor.idade = 196;
        professor.sexo = 'H';
        System.out.println("Nome: " + professor.nome + "\nIdade: " + professor.idade + "\nSexo: " + professor.sexo);
    }
}
