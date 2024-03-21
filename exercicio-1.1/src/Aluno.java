public class Aluno {
    String nome;
    String curso;
    Avaliacao notas;

    Aluno(String nome, String curso, Avaliacao notas) {
        this.nome = nome;
        this.curso = curso;
        this.notas = notas;
    }

    void info() {
        double mediaAritmetica = notas.mediaAritmetica();
        double mediaPanderada = notas.mediaPonderada();

        System.out.println("-----------------------------");
        System.out.println("     Informação do aluno");
        System.out.println("Nome: " + nome);
        System.out.println("Curso: " + curso);
        System.out.println("Média Aritmética do " + nome + " é de " + mediaAritmetica);
        System.out.println("Média Panderada do " + nome + " é de " + mediaPanderada);
    }
}
