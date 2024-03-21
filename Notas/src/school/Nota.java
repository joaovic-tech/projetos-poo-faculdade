package school;

import java.util.Scanner;

public class Nota {
    private double nota1;
    private double nota2;
    private int faltas;

    public Nota(){}

    public Nota(double nota1, double nota2, int faltas) {
        setNota1(nota1);
        setNota2(nota2);
        setFaltas(faltas);
    }

    public boolean setNota1(double nota1) {
        if (nota1 < 0 || nota1 > 10) {
            System.out.println("Nota inválida");
            return false;
        }
        this.nota1 += nota1;
        return true;
    }

    public boolean setNota2(double nota2) {
        if (nota2 < 0 || nota2 > 10) {
            System.out.println("Nota inválida");
            return false;
        }
        this.nota2 += nota2;
        return true;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public int getFaltas() {
        return faltas;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void resultado() {
        double media = (nota1 + nota2) / 2;

        System.out.println("\n=======================================================");

        System.out.println("Média do aluno é de " + media);
        System.out.println("Quantidade de faltas do aluno é de " + faltas);

        if (faltas > 7) {
            System.out.println("O aluno foi reprovado por faltas!!!");
        } else if (media <= 4) {
            System.out.println("O aluno foi reprovado!!!");
        } else if (media <= 7) {
            double notaFinal = 10 - media;

            System.out.println("O aluno ficou em prova final!!!");
            System.out.println("- Ele precisar tirar " + notaFinal + " na prova final\n");

            Scanner resFinal = new Scanner(System.in);
            System.out.print("Digite a nota final do aluno: ");
            double mediaFinal = resFinal.nextDouble();

            String resultado = mediaFinal > media ? "aprovado" : "reprovado";


            System.out.println("O aluno foi "+ resultado +"!!!");

        } else {
            System.out.println("O aluno foi aprovado!!!");
        }

        System.out.println("=======================================================");
    }
}
