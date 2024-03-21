package college;

public class Aluno {
    public String nome;
    private int matricula;
    double desconto;
    Curso curso;

    public Aluno(String nome, int matricula, double desconto, Curso curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.desconto = desconto;
        this.curso = curso;
    }

    public void descrever() {
        System.out.println("\n--------------------------------------");
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Metrícula do aluno: " + matricula);
        System.out.println("Desconto do aluno: " + desconto);
        curso.descrever();
        System.out.println("Pagamento do aluno com desconto " + nome + ": " + pagamento());
        System.out.println("--------------------------------------");
    }

    protected double pagamento() {
        // Informar o preço que o aluno paga, considerando seu desconto e o preço de seu curso;

        return curso.mensalidade * (1 - desconto);
    }
}
