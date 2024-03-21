package empresa;

import java.util.ArrayList;

public class Turma {
    final String nome;
    final Professor professor;
    final ArrayList<Aluno> alunos;

    Turma(String nome, Professor professor, ArrayList<Aluno> alunos) {
        this.nome = nome;
        this.professor = professor;
        this.alunos = alunos;
    }

    public void info() {
        System.out.println("\n" + this.nome);
        System.out.println("---------------------------");
        System.out.println("Informações do professor da turma:");
        this.professor.info();
        System.out.println("---------------------------");
        System.out.println("Alunos da turma: ");

        for (Aluno aluno : alunos) {
            aluno.info();
            System.out.println("---------------------------");
        }
    }
}
