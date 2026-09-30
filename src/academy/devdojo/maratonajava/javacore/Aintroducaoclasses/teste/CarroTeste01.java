package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Kombi";
        carro1.ano = 1975;
        carro1.modelo = "Corujinha";

        carro2.nome = "Fusca";
        carro2.ano = 1996;
        carro2.modelo = "Itamar";

        System.out.println("==Carro 1==" + "\nNome: " + carro1.nome + "\nAno: " + carro1.ano + "\nModelo: " + carro1.modelo);
        System.out.println("\n==Carro 2==" + "\nNome: " + carro2.nome + "\nAno: " + carro2.ano + "\nModelo: " + carro2.modelo);

        carro1 = carro2;

        System.out.println("\n==Carro 1==" + "\nNome: " + carro1.nome + "\nAno: " + carro1.ano + "\nModelo: " + carro1.modelo);

    }
}
