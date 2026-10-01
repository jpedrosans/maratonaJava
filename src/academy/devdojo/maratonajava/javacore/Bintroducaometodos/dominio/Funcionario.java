package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprimirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (salarios == null){
            return;
        }
        System.out.print("Salários: ");
        for (double i : salarios) {
            System.out.print(i + " ");
        }
        imprimirMedia();
    }

    public void imprimirMedia() {
        if (salarios == null){
            return;
        }
        double media = 0;
        for (double i : salarios) {
            media += i;
        }
        media /= salarios.length;
        System.out.println("\nMédia salárial: " + media);
    }
}
