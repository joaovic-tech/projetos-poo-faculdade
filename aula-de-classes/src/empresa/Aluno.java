package empresa;

import java.util.Arrays;

public class Aluno {
    private int matricula;
    public String nome;
    public String CPF;
    protected int notas[];

    // criando um constructor sem parâmetros
    public Aluno(){}

    // criando um constructor com parametros
    public Aluno(int matricula, String nome, String CPF, int[] notas) {
        this.matricula = matricula;
        this.nome = nome;
        this.CPF = CPF;
        this.notas = notas;
    }

    public void info() {
        System.out.println("Matricula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + CPF);
        System.out.print("Notas do aluno " + nome + ": ");

        for(int i = 0; i < notas.length; i++) {
            System.out.print(notas[i] + " ");
        }
    }

}
