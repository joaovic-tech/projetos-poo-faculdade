package school;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Nota aluno1 = new Nota();

        System.out.print("Digite quantas faltas o aluno tem: ");
        Scanner resFaltas = new Scanner(System.in);
        int faltas = resFaltas.nextInt();
        aluno1.setFaltas(faltas);

        Scanner res1 = new Scanner(System.in);
        System.out.print("Digite a 1° nota do aluno: ");
        double nota1 = res1.nextDouble();

        if (!aluno1.setNota1(nota1)) {
            return;
        }

        System.out.print("Digite a 2° nota do aluno: ");
        Scanner res2 = new Scanner(System.in);
        double nota2 = res2.nextDouble();


        if (!aluno1.setNota2(nota2)) {
            return;
        }

        aluno1.resultado();

        Nota aluno2 = new Nota(9, 9, 2);
        aluno2.resultado();
    }
}
