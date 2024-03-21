package college;

public class Curso {
    public String nome;
    public double mensalidade;

    public Curso(String nome, double mensalidade) {
        this.nome = nome;
        this.mensalidade = mensalidade;
    }

    public void descrever() {
        System.out.println("Nome do curso: " + nome);
        System.out.println("Mensalidade do curso: " + mensalidade);
    }
}
