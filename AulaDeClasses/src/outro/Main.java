package outro;

import empresa.Aluno;

public class Main {
    public static void main(String[] args) {
        int[] notas = {100, 100, 90};
        Aluno a = new Aluno(564, "Super Mario", "111.111.111-11", notas);
        a.info();
    }
}
