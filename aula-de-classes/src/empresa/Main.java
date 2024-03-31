package empresa;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Criando um aluno(objeto) com a classe Aluno(class)

        Aluno alunoX = new Aluno();
        alunoX.nome = "Joãozinho developer";
        alunoX.CPF = "000.000.000-00";
        alunoX.notas = new int[]{100, 100, 90};

        // Criando um novo aluno usando um construtor
        int[] notasAlunosY = {100, 100, 90};
        Aluno alunoY = new Aluno(2, "Javinha linguage", "111.111.111-11", notasAlunosY);

        // Adicionando alunos na lista da alunos
        ArrayList<Aluno> alunos = new ArrayList<>();
        alunos.add(alunoX);
        alunos.add(alunoY);

        // Criando um professor
        Professor professor = new Professor(1, "Leonardo", "Doutorado em Informática");

        // Criando uma turma
        Turma turma = new Turma("Turma Nº 01", professor, alunos);
        turma.info();
    }
}
