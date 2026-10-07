package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Seminario {
    private String titulo;
    private Local endereco;
    private Aluno[] alunos;

    public Seminario(String titulo, Local endereco) {
        this.titulo = titulo;
        this.endereco = endereco;
    }

    public Seminario(String titulo, Local endereco, Aluno[] alunos) {
        this.titulo = titulo;
        this.endereco = endereco;
        this.alunos = alunos;
    }

    public void imprime() {
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Endereço: " + endereco.getEndereco());
        System.out.println("Alunos inscritos:");
        if (alunos != null) {
            for (Aluno aluno : alunos) {
                System.out.println("Nome: " + aluno.getNome() + " | Idade: " + aluno.getIdade());
            }
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Local getEndereco() {
        return endereco;
    }

    public void setEndereco(Local endereco) {
        this.endereco = endereco;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
}
