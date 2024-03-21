package college;

public class Main {
    public static void main(String[] args) {
        Aluno aluno01 = new Aluno("Mario", 111, 0.15, new Curso("Engenharia Mecânica", 1250));

        aluno01.descrever();
    }
}
